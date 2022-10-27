package team.marela.backend.api.exceptions;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionApiModel {
    private String exception;
    private String exceptionMessage;
    private Integer exceptionNo;
    private Object body;
}
