package com.assessment.AdminEmployee.employee.controller;

import com.assessment.AdminEmployee.employee.exception.EmailException;
import com.assessment.AdminEmployee.employee.exception.EmployeeException;
import com.assessment.AdminEmployee.employee.model.ModelEmployee;
import com.assessment.AdminEmployee.employee.service.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2/")
@CrossOrigin(origins = "http://localhost:4000")
public class ControllerEmployee {
    @Autowired
    private ServiceEmployee serviceEmployee;
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelEmployee createEmployee(@RequestBody ModelEmployee user) {
        return serviceEmployee.createEmployee(user);
    }
    @RequestMapping(value = "/viewAll", method = RequestMethod.GET)
    public List<ModelEmployee> signupModelList() {
        return serviceEmployee.viewAllEmployee();
    }
    @RequestMapping(value = "/FindemployeeById/{id}", method = RequestMethod.GET)
    public Optional<ModelEmployee> employeeById(@PathVariable("id") int id) throws EmployeeException {
        Optional<ModelEmployee> modelEmployee=serviceEmployee.getEmployeeModelById(id);
        if(modelEmployee.isEmpty())
            throw new EmployeeException("EMPLOYEE not found");
        return modelEmployee;
    }
    @RequestMapping(value = "/updateEmployeeById/{id}", method = RequestMethod.PUT)
    public ModelEmployee updateEmployeeById(@PathVariable("id") int id, @RequestBody ModelEmployee emloyeeDetails) throws  EmployeeException, EmailException {
        Optional<ModelEmployee> modelEmployee=serviceEmployee.getEmployeeModelById(id);
        if(modelEmployee.isEmpty())
        {
            throw  new EmployeeException("can not update user does not exsits");
        }
        if(emloyeeDetails.getEmail().contains("@"))
            throw new EmailException("Cant change the email");

        return serviceEmployee.updateEmployee(id, emloyeeDetails);
    }
    @RequestMapping(value = "/deleteAllRecord", method = RequestMethod.DELETE)
    public String deleteLearners() {
        return serviceEmployee.deleteAllEmployee();
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteEmployeeById(@PathVariable("id") int id) {
        return serviceEmployee.deleteEmployeeById(id);
    }

}