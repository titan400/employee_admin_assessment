package com.assessment.AdminEmployee.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class RestExceptionHandler {

        @ExceptionHandler(EmployeeException.class)
        public ResponseEntity<ErrorResponse> exceptionEmployee(Exception e)
        {
            ErrorResponse errorResponse=new ErrorResponse();
            errorResponse.setErrorCode(HttpStatus.BAD_REQUEST.value());
            errorResponse.setMessage(e.getMessage());
            return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
        }
        @ExceptionHandler(IdException.class)
        public ResponseEntity<ErrorResponse> exceptionHandlerIdNotPresent(Exception e)
        {
            ErrorResponse errorResponse=new ErrorResponse();
            errorResponse.setErrorCode(HttpStatus.BAD_REQUEST.value());
            errorResponse.setMessage(e.getMessage());
            return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
        }
        @ExceptionHandler(EmailException.class)
        public ResponseEntity<ErrorResponse> emailExceptionHandler(Exception e)
        {
            ErrorResponse errorResponse=new ErrorResponse();
            errorResponse.setErrorCode(HttpStatus.BAD_REQUEST.value());
            errorResponse.setMessage(e.getMessage());
            return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
        }
}
