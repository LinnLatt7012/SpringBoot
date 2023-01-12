package com.linnlatt.SpringBootstutorial.service;

import com.linnlatt.SpringBootstutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(long departmentId);
    public void deleteDepartmentById(long departmentId);
}
