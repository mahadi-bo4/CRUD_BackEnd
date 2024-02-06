package com.example.studentcrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {


    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleApiRequestException(NotFoundException e){

        ApiException exception = new ApiException(
                e.getMessage(),
                HttpStatus.NOT_FOUND,
                null,
                ZonedDateTime.now()
        );

        return new ResponseEntity<>(exception,HttpStatus.NOT_FOUND);
    }
}
