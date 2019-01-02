package com.singpost.api.errors;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class APIErrorMessage
{
    private HttpStatus statusCode;
    private String message;
    private List<String> errorMessageList;

    public APIErrorMessage(HttpStatus statusCode,String message,List<String> errorMessageList)
    {
        super();
        this.statusCode=statusCode;
        this.message=message;
        this.errorMessageList=errorMessageList;
    }

    public APIErrorMessage(HttpStatus statusCode,String message,String error)
    {
        super();
        this.statusCode=statusCode;
        this.message=message;
        this.errorMessageList= Arrays.asList(error);
    }
}
