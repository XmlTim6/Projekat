package team6.xml_project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "submissions")
public class Submission {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private User author;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private User editor;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "reviewers",
            joinColumns = { @JoinColumn(name = "submission_id") },
            inverseJoinColumns = { @JoinColumn(name = "user_id") }
    )
    private List<User> reviewers = new ArrayList<>();

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SubmissionStatus status = SubmissionStatus.SUBMITTED_FOR_REVIEW;

    @Column(nullable = false)
    private Long currentRevision = 1L;

    public Submission() {
        super();
    }

    public Submission(User author) {
        this.author = author;
        this.currentRevision = 1L;
    }

    public Submission(User author, User editor, List<User> reviewers, SubmissionStatus status, Long revision) {
        this.author = author;
        this.editor = editor;
        this.reviewers = reviewers;
        this.status = status;
        this.currentRevision = revision;
    }

}
