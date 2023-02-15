package com.employee.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.entity.Employee;
import com.employee.management.repository.EmpRepo;

@Service
public class EmpService {

	@Autowired
	private EmpRepo repo;
	
	public void addEmp(Employee emp) {
		repo.save(emp);
	}
}
