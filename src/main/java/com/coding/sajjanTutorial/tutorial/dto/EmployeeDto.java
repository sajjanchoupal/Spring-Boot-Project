package com.coding.sajjanTutorial.tutorial.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class EmployeeDto {
	private Long id;
	private String name;
	private LocalDate dateOfJoining;
	@JsonProperty("isActive")
	private boolean isActive;

	public EmployeeDto() {

	}

	public EmployeeDto(Long id, String name, LocalDate dateOfJoining, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.isActive = isActive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", dateOfJoining=" + dateOfJoining + ", isActive="
				+ isActive + "]";
	}

}
