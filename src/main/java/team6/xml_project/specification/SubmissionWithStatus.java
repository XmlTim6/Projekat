package team6.xml_project.specification;

import org.springframework.data.jpa.domain.Specification;
import team6.xml_project.models.Submission;
import team6.xml_project.models.SubmissionStatus;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class SubmissionWithStatus implements Specification<Submission> {

    private SubmissionStatus status;

    public SubmissionWithStatus(SubmissionStatus status) {
        this.status = status;
    }

    @Override
    public Predicate toPredicate(Root<Submission> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        query.distinct(true);
        if (this.status == null) {
            return criteriaBuilder.isTrue(criteriaBuilder.literal(true));
        }
        return criteriaBuilder.equal(root.get("status"), this.status);    }
}
