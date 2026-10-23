package com.br.appspring.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Getter
@Setter
public class RestErrorMessage {
    private String message;
    private HttpStatus status;
}
