package com.projet.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.projet.demo.model.Direction;
import com.projet.demo.service.DirectionServiceImpl;

@Controller
public class DirectionController {
	
	
	@Autowired
	DirectionServiceImpl service;
	
	
	@PostMapping("/admin/direction")
	public String addDirection(Direction direction) {
		
		service.saveDirection(direction);
		
		return "redirect:/admin/employee-direction-table";
		
	}

	@GetMapping("/admin/viewDirection")
	public String viewDirection(@RequestParam String directionName, Model model) {
		
		Direction direction = service.getDirectionById(directionName);
		service.deleteDirectionById(directionName);
		model.addAttribute("direction", direction);	
		return "employee/view_direction";
	}
	
	
	@RequestMapping("/admin/deleteDirection")
	public String deleteDirection(@RequestParam String directionName) {
		
		service.deleteDirectionById(directionName);
		return "redirect:/admin/employee-direction-table";
	}

}
