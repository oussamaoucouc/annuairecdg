package com.projet.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet.demo.model.Branch;
import com.projet.demo.service.BranchServiceImpl;

@Controller
public class BranchController {
	
	@Autowired
	BranchServiceImpl service;
	
	
	@PostMapping("/admin/branch")
	public String addBranch(Branch branch) {
		
		service.saveBranch(branch);
		
		return "redirect:/admin/employee-branch-table";
		
	}

	@GetMapping("/admin/viewBranch")
	public String viewBranch(@RequestParam String branchName, Model model) {
		
		Branch branch = service.getBranchById(branchName);
		service.deleteBranchById(branchName);
		model.addAttribute("branch", branch);	
		return "employee/view_branch";
	}
	
	
	@RequestMapping("/admin/deleteBranch")
	public String deleteBranch(@RequestParam String branchName) {
		
		service.deleteBranchById(branchName);
		return "redirect:/admin/employee-branch-table";
	}

}
