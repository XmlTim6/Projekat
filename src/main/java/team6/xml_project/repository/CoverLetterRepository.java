package team6.xml_project.repository;

import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.models.xml.submission.Submission;

import java.util.List;

public interface CoverLetterRepository {

    void save(String coverLetter, Submission submission);

    CoverLetter find(String submissionId, Long revision) throws Exception;

    List<String> getAllCoverLetterURIsOfSubmission(String submissionId) throws Exception;
}
