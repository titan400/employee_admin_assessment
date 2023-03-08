package com.assessment.AdminEmployee.employee.exception;

import com.assessment.AdminEmployee.employee.model.ModelEmployee;
import com.assessment.AdminEmployee.employee.service.ServiceEmployee;

public class EmailException extends Exception{
    private String err;
    public ServiceEmployee serviceEmployee;
    public  EmailException(String err) {
        super(err);
        this.err = err;
    }
    public EmailException() {}
}
