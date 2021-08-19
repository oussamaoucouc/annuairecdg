package com.projet.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet.demo.model.Department;
import com.projet.demo.service.DepartmentServiceImpl;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentServiceImpl service;
	
	@PostMapping("/admin/department")
	public String addDepartment(Department department) {
		
		service.saveDepartment(department);
		
		return "redirect:/admin/employee-department-table";
		
	}

	@GetMapping("/admin/viewDepartment")
	public String viewDepartment(@RequestParam String departmentName, Model model) {
		
		Department department = service.getDepartmentById(departmentName);
		service.deleteDepartmentById(departmentName);
		model.addAttribute("department", department);
		return "employee/view_department";
	}
	
	@RequestMapping("/admin/deleteDepartment")
	public String deleteDepartment(@RequestParam String departmentName) {
		
		service.deleteDepartmentById(departmentName);
		return "redirect:/admin/employee-department-table";
	}

}
