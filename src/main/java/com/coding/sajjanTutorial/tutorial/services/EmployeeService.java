package com.coding.sajjanTutorial.tutorial.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.coding.sajjanTutorial.tutorial.dto.EmployeeDto;
import com.coding.sajjanTutorial.tutorial.entities.EmployeeEntity;
import com.coding.sajjanTutorial.tutorial.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	final EmployeeRepository employeeRepository;
	final ModelMapper modelMapper;

	public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
		this.employeeRepository = employeeRepository;
		this.modelMapper = modelMapper;
	}

	public EmployeeDto getEmployeeById(Long id) {
		EmployeeEntity employeeEntity = employeeRepository.getById(id);
		return modelMapper.map(employeeEntity, EmployeeDto.class);
	}

	public EmployeeDto createNewEmployee(EmployeeDto employeeDto) {
		EmployeeEntity employeeEntity = modelMapper.map(employeeDto, EmployeeEntity.class);
		return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDto.class);
	}

	public List<EmployeeDto> getAllemployees() {
		return employeeRepository.findAll().stream()
				.map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDto.class)).collect(Collectors.toList());

	}

	public boolean deleteEmployeeById(Long id) {
		boolean isPresent = employeeRepository.existsById(id);
		if (!isPresent)
			return false;
		employeeRepository.deleteById(id);
		return true;
	}

}
