package team.marela.backend.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import team.marela.backend.core.exceptions.BadRequestException;
import team.marela.backend.core.exceptions.DataNotFoundException;
import team.marela.backend.core.exceptions.ForbiddenException;

@ControllerAdvice
public class ExceptionApiHandler {

    @ExceptionHandler(value = {DataNotFoundException.class})
    public ResponseEntity<ExceptionApiModel<Object>> handleDataNotFoundException(DataNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionApiModel<>(exception.getMessage(), HttpStatus.NOT_FOUND.value()));
    }

    @ExceptionHandler(value = {ForbiddenException.class})
    public ResponseEntity<ExceptionApiModel<Object>> handleForbiddenException(ForbiddenException exception) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ExceptionApiModel<>(exception.getMessage(), HttpStatus.FORBIDDEN.value()));
    }

    @ExceptionHandler(value = {BadRequestException.class})
    public ResponseEntity<ExceptionApiModel<Object>> handleBadRequestException(BadRequestException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionApiModel<>(exception.getMessage(), HttpStatus.BAD_REQUEST.value()));
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ExceptionApiModel<Object>> handleException(Exception exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ExceptionApiModel<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }
}
