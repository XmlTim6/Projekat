package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.exception.NotSubmissionAuthorException;
import team6.xml_project.exception.PermissionDeniedException;
import team6.xml_project.exception.SubmissionClosedForCoverLetters;
import team6.xml_project.exception.SubmissionNotFoundException;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.User;
import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.CoverLetterRepository;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.service.CoverLetterService;
import team6.xml_project.service.SubmissionService;
import team6.xml_project.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoverLetterServiceImpl implements CoverLetterService {

    @Autowired
    CoverLetterRepository coverLetterRepository;

    @Autowired
    SubmissionService submissionService;

    @Autowired
    UserService userService;

    @Override
    public void save(String coverLetter, String submissionId, Long userId) {
        Submission submission = submissionService.findById(submissionId);

        if (!submission.getSubmissionStatus().equals(SubmissionStatus.SUBMITTED_FOR_REVIEW.toString()))
            throw new SubmissionClosedForCoverLetters();

        if (submission.getAuthorId() != userId)
            throw new NotSubmissionAuthorException();

        coverLetterRepository.save(coverLetter, submission);
    }

    @Override
    public CoverLetter findCoverLetter(String submissionId, Long revision, Long userId) {
        Submission submission = submissionService.findById(submissionId);

        if (!(submission.getAuthorId() == userId) && !(submission.getEditorId() == userId))
            throw new PermissionDeniedException();

        try {
            return coverLetterRepository.find(submissionId, revision);
        } catch (Exception e) {
            throw new SubmissionNotFoundException();
        }
    }

    @Override
    public List<String> findCoverLetterURIsOfSubmission(String submissionId, Long userId) {
        Submission submission = submissionService.findById(submissionId);

        if (!(submission.getAuthorId() == userId) && !(submission.getEditorId() == userId))
            throw new PermissionDeniedException();

        List<String> urisOld;
        List<String> uris = new ArrayList<>();

        try {
            urisOld =  coverLetterRepository.getAllCoverLetterURIsOfSubmission(submissionId);
        } catch (Exception e) {
            throw new SubmissionNotFoundException();
        }

        for (String uri: urisOld) {
            int index = uri.indexOf("revision_") + "revision_".length();
            uris.add("http://localhost:3000/details/" + submissionId +
                    "/" + uri.substring(index, index + 1) +
                    "/" + uri.substring(index + 2));
        }

        return uris;
    }
}
