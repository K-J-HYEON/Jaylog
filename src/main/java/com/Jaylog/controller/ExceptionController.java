package com.Jaylog.controller;


import com.Jaylog.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@ControllerAdvice
public class ExceptionController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ErrorResponse invalidRequestHandler(MethodArgumentNotValidException e) {
            ErrorResponse response = new ErrorResponse("400", "잘못된 요청입니다.");

            for (FieldError fieldError : e.getFieldErrors()) {
                response.addValidation(fieldError.getField(), fieldError.getDefaultMessage());
            }

            return response;
    }
}
