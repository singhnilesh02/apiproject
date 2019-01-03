package com.singpost.api.enums;

public enum ErrorMessage
{
    InternalServerError("Internal Server Error");
    private String message;

    private ErrorMessage(String message)
    {
        this.message=message;
    }

    public String getMessage()
    {
        return this.message;
    }
}
