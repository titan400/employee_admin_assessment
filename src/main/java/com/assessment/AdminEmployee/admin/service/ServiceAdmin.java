package com.assessment.AdminEmployee.admin.service;

import com.assessment.AdminEmployee.admin.model.AdminModel;
import com.assessment.AdminEmployee.admin.repository.RepositoryAdmin;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceAdmin {
    @Autowired
    private RepositoryAdmin repositoryAdmin;

    public AdminModel saveDetails(AdminModel payload) {
        return repositoryAdmin.save(payload);
    }
}
