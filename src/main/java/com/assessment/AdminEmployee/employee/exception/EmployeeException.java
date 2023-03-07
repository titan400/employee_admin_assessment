package com.assessment.AdminEmployee.employee.exception;


public class EmployeeException extends Exception {
    private static final Long serialVersionUID = 1L;
    private String errorMessage;

    public EmployeeException() {

    }

    public EmployeeException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
