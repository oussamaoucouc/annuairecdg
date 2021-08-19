package com.projet.demo.service;

import java.util.List;

import com.projet.demo.model.Department;

public interface DepartmentService {
	List<Department> getAllDepartments();
	void saveDepartment(Department department);
	Department getDepartmentById(String departmentName);
	void deleteDepartmentById(String departmentName);	
}
