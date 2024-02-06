package com.example.studentcrud.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApiException {

    private String message;
    private HttpStatus httpStatus;
    private Throwable throwable;
    private ZonedDateTime zonedDateTime;


    @Override
    public String toString() {
        return "ApiException{" +
                "message='" + message + '\'' +
                ", httpStatus=" + httpStatus +
                ", throwable=" + throwable +
                ", zonedDateTime=" + zonedDateTime +
                '}';
    }
}
