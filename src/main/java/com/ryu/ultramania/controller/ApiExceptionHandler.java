package com.ryu.ultramania.controller;


import com.ryu.ultramania.exception.UserNotFoundException;
import com.ryu.ultramania.model.ApiErrorEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ApiErrorEntity> handleUserNotFoundException(UserNotFoundException unfe){
        ApiErrorEntity apiErrorEntity = new ApiErrorEntity();
        apiErrorEntity.setTimeStamp(new Date());
        apiErrorEntity.setCode(1002);
        apiErrorEntity.setMessage(unfe.getMessage());

        return new ResponseEntity<>(apiErrorEntity, HttpStatus.NOT_FOUND);
    }
}
