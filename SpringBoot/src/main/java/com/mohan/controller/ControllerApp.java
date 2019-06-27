package com.mohan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mohan.model.Employee;
import com.mohan.repository.EmployeeRepository;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ControllerApp {

	@Autowired
	EmployeeRepository repository;

	@PostMapping(value = "/insert")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}
    
	@GetMapping(value = "/getAll")
	public List<Employee> getAllEmployees() {
		List<Employee> employee = repository.findAll();
		return employee;
	}
	
	
	@PostMapping(value = "/save")
	public String getHome(Employee employee) {
		return "user.html";
	}

	@GetMapping(value = "/delete/{id}")
	public String deleteEmployee(@PathVariable("id") Long id) {
		repository.deleteById(id);
		return "Employee Deleted successfully " + id;
	}
	
	
	
	@GetMapping(value = "/get/{name}")
	public Employee getEmployeeById(@PathVariable("name") String name) {
		Employee employee = repository.getEmployeeByEmpName(name);
		return employee;

	}

	@PutMapping(value = "/update/{id}")
	public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
		Employee employee1 = repository.save(employee);
		return employee1;
	}

}
