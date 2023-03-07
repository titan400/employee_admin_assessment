package com.assessment.AdminEmployee.employee.exception;

public class EmailException extends Exception{
    private String err;

    public EmailException(String err) {
        super(err);
        this.err = err;
    }
    public EmailException() {}
}
