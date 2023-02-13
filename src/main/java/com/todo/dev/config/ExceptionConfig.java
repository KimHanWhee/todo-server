package com.todo.dev.config;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionConfig {
    @ExceptionHandler(ExpiredJwtException.class)
    public ResponseEntity<String> tokenTimeOut(ExpiredJwtException e){
        ResponseEntity<String > responseEntity = new ResponseEntity<>("refresh token", HttpStatus.UNAUTHORIZED);
        return  responseEntity;
    }

    @ExceptionHandler(JwtException.class)
    public ResponseEntity<String> jwtExceptionHandler(JwtException e){
        ResponseEntity<String > responseEntity = new ResponseEntity<>("token error", HttpStatus.UNAUTHORIZED);
        return  responseEntity;
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> noArgumentException(){
        ResponseEntity<String> responseEntity =
                new ResponseEntity<>("token is Null", HttpStatus.UNAUTHORIZED);
        return responseEntity;
    }
}
