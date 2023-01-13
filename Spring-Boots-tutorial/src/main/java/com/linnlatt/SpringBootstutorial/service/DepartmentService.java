package com.linnlatt.SpringBootstutorial.service;

import com.linnlatt.SpringBootstutorial.entity.Department;
import com.linnlatt.SpringBootstutorial.error.DepartmentNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(long departmentId) throws DepartmentNotFoundException;
    public Department fetchDepartmentByName(String departmentName);

    public void deleteDepartmentById(long departmentId);

    public Department updateDepartment(Long departmentId,Department department);
}
