package com.example.springbootregex.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.ALREADY_REPORTED)
public class UserNameAlreadyAvailableException extends RuntimeException{

    public UserNameAlreadyAvailableException() {
    }

    public UserNameAlreadyAvailableException(String message) {
        super(message);
    }

    public UserNameAlreadyAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNameAlreadyAvailableException(Throwable cause) {
        super(cause);
    }

    public UserNameAlreadyAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
