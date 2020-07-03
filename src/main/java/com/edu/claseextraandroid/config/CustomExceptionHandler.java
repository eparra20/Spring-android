package com.edu.claseextraandroid.config;


import com.edu.claseextraandroid.dto.RestError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CustomExceptionHandler {

   @ExceptionHandler({RuntimeException.class})
   public ResponseEntity<RestError> handlerException(RuntimeException exception){
       RestError restError = RestError.builder().message(exception.getMessage()).code(HttpStatus.CONFLICT).build();
       return new ResponseEntity<>(restError,HttpStatus.CONFLICT);
   }
}
