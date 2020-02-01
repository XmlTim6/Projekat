package team6.xml_project.service;

import team6.xml_project.models.xml.cover_letter.CoverLetter;

import java.util.List;

public interface CoverLetterService {

    void save(String coverLetter, String submissionId, Long userId) throws Exception;

    CoverLetter findCoverLetter(String submissionId, Long revision, Long userId);

    List<String> findCoverLetterURIsOfSubmission(String submissionId, Long userId);
}
