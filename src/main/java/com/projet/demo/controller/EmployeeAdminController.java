package com.projet.demo.controller;


import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.projet.demo.service.BranchService;
import com.projet.demo.service.DepartmentService;
import com.projet.demo.service.DirectionService;
import com.projet.demo.service.EmployeeService;

import net.sf.jasperreports.engine.JRException;

@Controller
public class EmployeeAdminController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/admin/employee-datatable")
	public String employeeDataTable(Model model) {
		model.addAttribute("listEmployees",employeeService.getAllEmployees());
		return "employee/employee_table_list";
	}
	
	//new add
	@GetMapping("/admin/employee-user-datatable")
	public String employeeDataTableUsers(Model model) {
		model.addAttribute("listEmployees",employeeService.getAllEmployees());
		return "employee/employee_user_table_list";
	}
	
	
	
	
	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/admin/employee-department-table")
	public String departmentDataTable( Model model) {
		model.addAttribute("listDepartments",departmentService.getAllDepartments());
		return "employee/department_table_list";
	}
	
	
	@GetMapping("/admin/employee-user-department-table")
	public String departmentDataTableUsers( Model model) {
		model.addAttribute("listDepartments",departmentService.getAllDepartments());
		return "employee/department_user_table_list";
	}
	
	@Autowired
	private BranchService branchService;
	
	@GetMapping("/admin/employee-branch-table")
	public String branchDataTable(Model model) {
		model.addAttribute("listBranches", branchService.getAllBranches());
		return "employee/branch_table_list";
	}
	
	@GetMapping("/admin/employee-user-branch-table")
	public String branchDataTableUsers(Model model) {
		model.addAttribute("listBranches", branchService.getAllBranches());
		return "employee/branch_user_table_list";
	}
	
	
	@Autowired
	private DirectionService directionService;
	
	@GetMapping("/admin/employee-direction-table")
	public String directionDataTable(Model model) {
		model.addAttribute("listDirections", directionService.getAllDirections());
		return "employee/direction_table_list";
	}
	
	@GetMapping("/admin/employee-user-direction-table")
	public String directionDataTableUsers(Model model) {
		model.addAttribute("listDirections", directionService.getAllDirections());
		return "employee/direction_user_table_list";
	}
	
	
	
	
	
	
	@GetMapping("/admin/employee-dashboard")
	public String employeeDash() {
		return "employee/employee_admin_dashboard";
	}
	
	@GetMapping("/admin/employee-user-dashboard")
	public String employeeUserDash() {
		return "employee/employee_user_dashboard";
	}
	
	
	
	
	
	

	@GetMapping("/admin/employee-addEmp")
	public String employeeAdminAdd() {
		return "employee/employee_add";
	}
	
	
	@GetMapping("/admin/employee-department-add")
	public String departmentAdd() {
		return "employee/add_department";
	}
	
	
	@GetMapping("/admin/employee-branch-add")
	public String branchAdd() {
		return "employee/add_branch";
	}
	
	@GetMapping("/admin/employee-direction-add")
	public String directionAdd() {
		return "employee/add_direction";
	}
	
	
	
	@GetMapping("/admin/employee-view-employee")
	public String viewEmployee() {
		return "employee/view_employee";
	}
	
	@GetMapping("/admin/employee-view-department")
	public String viewDepartment() {
		return "employee/view_department";
	}
	
	@GetMapping("/admin/employee-view-branch")
	public String viewBranch() {
		return "employee/view_branch";
	}
	@GetMapping("/admin/employee-view-direction")
	public String viewDirection() {
		return "employee/view_direction";
	}
	
	
	
	
	
	@GetMapping("/employee/employee-profile")
	public String employeeProfile() {
		return "employee/employee_profile";
	}
	
	@GetMapping("/admin/employee-admin-profile")
	public String employeeAdminProfile() {
		return "employee/employee_admin_profile";
	}
	
	@GetMapping("/admin/employee-admin-login")
	public String employeeAdminLogin() {
		return "employee/employee_admin_login";
	}
	
	@GetMapping("/admin/organigramme")
	public String employeeAdminOrg() {
		return "employee/organigrame";
	}
	
	@GetMapping("/admin/user-organigramme")
	public String employeeAdminOrgUsers() {
		return "employee/user_organigramme";
	}
	
	@GetMapping("/admin/403")
	public String error403() {
		return "employee/403";
	}
	

	

	
		
	
}
