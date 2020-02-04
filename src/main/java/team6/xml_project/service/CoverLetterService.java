package team6.xml_project.service;


import java.util.List;

public interface CoverLetterService {

    void save(String coverLetter, String submissionId, Long userId) throws Exception;

    String findCoverLetter(String submissionId, Long revision, Long userId);

    List<String> findCoverLetterURIsOfSubmission(String submissionId, Long userId);
}
