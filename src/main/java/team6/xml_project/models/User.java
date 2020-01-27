package team6.xml_project.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(
        name = "users",
        indexes = { @Index(name = "idx_user_email", columnList = "email") })
public class User {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = false)
    private boolean isActiveAccount = false;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @ElementCollection
    private List<String> expertise;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToMany(mappedBy = "reviewers", fetch = FetchType.EAGER)
    private List<Submission> reviewedSubmissions;

    public User() {
        super();
    }

    public User(String email, String passwordHash, boolean isActiveAccount, String name, String surname, List<String> expertise, Role role) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.isActiveAccount = isActiveAccount;
        this.name = name;
        this.surname = surname;
        this.expertise = expertise;
        this.role = role;
    }
}
