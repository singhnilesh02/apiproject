package com.singpost.api.exceptionhandler;

import com.singpost.api.enums.ErrorMessage;
import com.singpost.api.errors.APIErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> exceptionHandler(Exception ex, WebRequest request)
    {
        APIErrorMessage apiErrorMessage =new APIErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR,
                ex.getLocalizedMessage(), ErrorMessage.InternalServerError.getMessage());
        return null;
    }
}
