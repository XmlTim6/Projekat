package team6.xml_project.exception;

public class UserNotFoundException extends EntityNotFoundException {

    public UserNotFoundException() {
        super("User not found");
    }
}
