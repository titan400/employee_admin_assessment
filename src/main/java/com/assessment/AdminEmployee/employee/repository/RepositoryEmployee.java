package com.assessment.AdminEmployee.employee.repository;

import com.assessment.AdminEmployee.admin.model.AdminModel;
import com.assessment.AdminEmployee.employee.model.ModelEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositoryEmployee extends JpaRepository<ModelEmployee,Integer>
{
}

