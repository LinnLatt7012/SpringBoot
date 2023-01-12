package com.linnlatt.SpringBootstutorial.controller;

import com.linnlatt.SpringBootstutorial.entity.Department;
import com.linnlatt.SpringBootstutorial.service.DepartmentService;
import com.linnlatt.SpringBootstutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){

        return departmentService.saveDepartment(department);
    }

}