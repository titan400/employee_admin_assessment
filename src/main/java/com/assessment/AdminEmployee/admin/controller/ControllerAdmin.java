package com.assessment.AdminEmployee.admin.controller;

import com.assessment.AdminEmployee.admin.model.AdminModel;
import com.assessment.AdminEmployee.admin.service.ServiceAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ControllerAdmin {
    @Autowired
    private ServiceAdmin serviceAdmin;
    @PostMapping("save")
    public AdminModel saveDetails(@RequestBody AdminModel payload) {
        return serviceAdmin.saveDetails(payload);
    }
}
