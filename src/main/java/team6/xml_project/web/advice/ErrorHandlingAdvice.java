package team6.xml_project.web.advice;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import team6.xml_project.exception.*;

import javax.persistence.LockTimeoutException;
import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceException;
import javax.persistence.PessimisticLockException;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.xml.bind.JAXBException;
import java.util.Objects;

@ControllerAdvice
public class ErrorHandlingAdvice {

	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	ValidationErrorResponse onConstraintValidationException(ConstraintViolationException e) {
		ValidationErrorResponse error = new ValidationErrorResponse();
		for (ConstraintViolation violation : e.getConstraintViolations()) {
			error.getViolations().add(new Violation(violation.getPropertyPath().toString(), violation.getMessage()));
		}
		return error;
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	ValidationErrorResponse onMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		ValidationErrorResponse error = new ValidationErrorResponse();
		for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
			error.getViolations().add(new Violation(fieldError.getField(), fieldError.getDefaultMessage()));
		}
		return error;
	}

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    ValidationErrorResponse onHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        ValidationErrorResponse error = new ValidationErrorResponse();
        error.getViolations().add(new Violation("Cause", e.getMessage()));
        return error;
    }

	@ExceptionHandler(JAXBException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	ValidationErrorResponse onJAXBException(HttpMessageNotReadableException e) {
		ValidationErrorResponse error = new ValidationErrorResponse();
		error.getViolations().add(new Violation("Cause", e.getMessage()));
		return error;
	}

    @ExceptionHandler(ConversionFailedException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    ValidationErrorResponse onConversionFailedException(ConversionFailedException e) {
        ValidationErrorResponse error = new ValidationErrorResponse();
        error.getViolations().add(new Violation(Objects.requireNonNull(e.getValue()).toString(), "Unsupported value"));
        return error;
    }

	@ExceptionHandler(EntityNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	ValidationErrorResponse onEntityNotFoundException(EntityNotFoundException e) {
		ValidationErrorResponse error = new ValidationErrorResponse();
		error.getViolations().add(new Violation("Cause", e.getMessage()));
		return error;
	}

	@ExceptionHandler(value = { PermissionDeniedException.class})
	@ResponseStatus(value = HttpStatus.FORBIDDEN)
	@ResponseBody
	ValidationErrorResponse onPermissionDeniedException(RuntimeException e) {
		ValidationErrorResponse error = new ValidationErrorResponse();
		error.getViolations().add(new Violation("Cause", e.getMessage()));
		return error;
	}

	@ExceptionHandler(value = { DocumentNotSavedException.class})
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	ValidationErrorResponse onDocumentNotSavedException(RuntimeException e) {
		ValidationErrorResponse error = new ValidationErrorResponse();
		error.getViolations().add(new Violation("Cause", e.getMessage()));
		return error;
	}

	@ExceptionHandler(value = { OptimisticLockException.class, PessimisticLockException.class,
			LockTimeoutException.class })
	@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
	@ResponseBody
	ValidationErrorResponse onLockException(PersistenceException e) {
		ValidationErrorResponse error = new ValidationErrorResponse();
		error.getViolations().add(new Violation("Cause",
				"Operation failed because the data was changed in the meanwhile. Please try again."));
		return error;
	}

	@ExceptionHandler(EmailAlreadyExistsException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	ValidationErrorResponse onEmailAlreadyExistsException(EmailAlreadyExistsException e){
		ValidationErrorResponse error = new ValidationErrorResponse();
		error.getViolations().add(new Violation("email", "Email already taken."));
		return error;
	}


	@ExceptionHandler(FailedToGenerateDocumentException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	ValidationErrorResponse onFailedToGenerateDocumentException(FailedToGenerateDocumentException e){
		ValidationErrorResponse error = new ValidationErrorResponse();
		error.getViolations().add(new Violation("document", e.getMessage()));
		return error;
	}

}
