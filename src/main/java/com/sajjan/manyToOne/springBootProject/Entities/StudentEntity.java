package com.sajjan.manyToOne.springBootProject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private int salary;
	private String address;

	@ManyToOne
	@JoinColumn(name = "pidfk")
	private ProjectEntity project;

	public StudentEntity() {
	}

	public StudentEntity(int empId, String empName, int salary, String address, ProjectEntity project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
		this.project = project;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ProjectEntity getProject() {
		return project;
	}

	public void setProject(ProjectEntity project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "StudentEntity [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ ", project=" + project + "]";
	}

}