package team.marela.backend.api.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionApiModel<T> {
    private String exception;
    private Integer exceptionNo;
    private T body;

    public ExceptionApiModel() {
    }

    public ExceptionApiModel(String exception, Integer exceptionNo) {
        this.exception = exception;
        this.exceptionNo = exceptionNo;
    }

    public ExceptionApiModel(String exception, Integer exceptionNo, T body) {
        this.exception = exception;
        this.exceptionNo = exceptionNo;
        this.body = body;
    }
}
