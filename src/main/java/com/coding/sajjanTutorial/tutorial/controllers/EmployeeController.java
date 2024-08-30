package com.coding.sajjanTutorial.tutorial.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.sajjanTutorial.tutorial.dto.EmployeeDto;
import com.coding.sajjanTutorial.tutorial.services.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping
	public List<EmployeeDto> getAllEmployees() {
		return employeeService.getAllemployees();
	}

	@GetMapping(path = "/{id}")
	public EmployeeDto getEmployeeById(@PathVariable("id") Long employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}

	@PostMapping
	public EmployeeDto createNewEmployee(@RequestBody EmployeeDto employeeDto) {
		return employeeService.createNewEmployee(employeeDto);
	}

	@DeleteMapping(path = "/{id}")
	public boolean deleteEmployeeById(@PathVariable Long id) {
		return employeeService.deleteEmployeeById(id);
	}
}
