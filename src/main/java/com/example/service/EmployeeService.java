package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.EmployeeEntity;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EmployeeRepository repository;
	
	public List<EmployeeEntity> listEmployee(){
		return repository.findAll();
	}
	
	public EmployeeEntity getEmployee(long id){
		return repository.findById(id).get();
	}
	
	public EmployeeEntity save(String firstName, String lastName, String email){
		EmployeeEntity emp = new EmployeeEntity(firstName, lastName, email);
		return repository.save(emp);
	}
}
