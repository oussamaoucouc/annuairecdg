package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.demo.model.Department;
import com.projet.demo.repo.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public void saveDepartment(Department department) {
		this.departmentRepository.save(department);
	}
		

	@Override
	public Department getDepartmentById(String departmentName) {
		Optional<Department> optional = departmentRepository.findById(departmentName);
		Department department = null;
		if(optional.isPresent()) {
			department = optional.get();
		}else {
			throw new RuntimeException("Department not found for id :: " + departmentName);
		}
		return department;
	}

	@Override
	public void deleteDepartmentById(String departmentName) {
		this.departmentRepository.deleteById(departmentName);
		
	}

}
