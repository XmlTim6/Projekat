package team6.xml_project.exception;

public abstract class EntityNotFoundException extends RuntimeException {
	
	public EntityNotFoundException(String message) {
		super(message);
	}

}
