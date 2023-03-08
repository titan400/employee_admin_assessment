package com.assessment.AdminEmployee.employee.service;


import com.assessment.AdminEmployee.employee.model.ModelEmployee;
import com.assessment.AdminEmployee.employee.repository.RepositoryEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEmployee {
    @Autowired
    private RepositoryEmployee repositoryEmployee;
    public ModelEmployee createEmployee(ModelEmployee emp) {

        return repositoryEmployee.save(emp);
    }
    public List<ModelEmployee> viewAllEmployee() {
        return repositoryEmployee.findAll();
    }

    public Optional<ModelEmployee> getEmployeeModelById(Integer id) {

        return repositoryEmployee.findById(id);

    }

    public String deleteAllEmployee() {
        repositoryEmployee.deleteAll();
        return "All Employee record Deleted";
    }
    public String deleteEmployeeById(int id)
    {
        repositoryEmployee.deleteById(id);
        return "Employee record deleted wit id"+id;
    }
    public ModelEmployee updateEmployee(Integer id, ModelEmployee employeeDetails) {
        if (!repositoryEmployee.existsById(id)) {
            return null;
        }
        Optional<ModelEmployee> employee= repositoryEmployee.findById(id);
        ModelEmployee new_employee = employee.get();
        new_employee.setName(employeeDetails.getName());
        //new_employee.setEmail(employeeDetails.getEmail());
        return repositoryEmployee.save(new_employee);
    }

}