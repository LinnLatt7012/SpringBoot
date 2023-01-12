package com.linnlatt.SpringBootstutorial.repository;

import com.linnlatt.SpringBootstutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}