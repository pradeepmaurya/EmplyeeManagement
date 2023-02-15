package com.employee.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Employee;
import com.employee.management.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {

	@Autowired
	public EmpService service;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	
	@GetMapping("/addEmp")
	public String addEmp() {
		return "addEmp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee emp, HttpSession session) {
		service.addEmp(emp);
		session.setAttribute("msg", "Employee added Succesfully..");
		System.out.println(emp);
		return "redirect:/";
	}
}
