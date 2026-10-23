package com.br.appspring.infra;

import com.br.appspring.exception.ExceptionUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {ExceptionUser.class})
    private ResponseEntity<String> responseEntity(Exception exception) {
        RestErrorMessage threatResponse = new RestErrorMessage(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not found");
    }

//    private RestErrorMessage responseEntity(Exception exception, HttpStatus status) {
  //      RestErrorMessage threatResponse = new RestErrorMessage(exception.getMessage(), status);
    //}
}
