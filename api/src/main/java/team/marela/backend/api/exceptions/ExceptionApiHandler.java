package team.marela.backend.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import team.marela.backend.core.exceptions.BadRequestException;
import team.marela.backend.core.exceptions.DataNotFoundException;
import team.marela.backend.core.exceptions.ForbiddenException;

@ControllerAdvice
public class ExceptionApiHandler {

    @ExceptionHandler(value = {DataNotFoundException.class})
    public ResponseEntity<ExceptionApiModel> handleDataNotFoundException(DataNotFoundException exception) {
        return generateResponseEntity(exception, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {ForbiddenException.class})
    public ResponseEntity<ExceptionApiModel> handleForbiddenException(ForbiddenException exception) {
        return generateResponseEntity(exception, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(value = {BadRequestException.class, MethodArgumentNotValidException.class})
    public ResponseEntity<ExceptionApiModel> handleBadRequestException(Exception exception) {
        return generateResponseEntity(exception, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ExceptionApiModel> handleException(Exception exception) {
        return generateResponseEntity(exception, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<ExceptionApiModel> generateResponseEntity(Exception exception, HttpStatus status) {
        return ResponseEntity.status(status).body(
                ExceptionApiModel.builder()
                        .exception(exception.getClass().getSimpleName())
                        .exceptionNo(status.value())
                        .exceptionMessage(exception.getMessage())
                        .body(exception.getCause())
                        .build()
        );
    }
}
