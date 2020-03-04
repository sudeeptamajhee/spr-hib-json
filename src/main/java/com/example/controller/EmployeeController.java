package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.EmployeeEntity;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/list")
	public List<EmployeeEntity> listEmployee() {
		return employeeService.listEmployee();
	}

	@RequestMapping("/{id}")
	public EmployeeEntity getEmployee(@PathVariable long id) {
		return employeeService.getEmployee(id);
	}

	@RequestMapping("/add")
	public EmployeeEntity save(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email) {
		return employeeService.save(firstName, lastName, email);
	}
}
