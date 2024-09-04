package com.sajjanchoupal.oneToMany.springboot.project.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentTab")
public class Student {
	@Id
	private Integer sid;
	private String sname;
	
	@OneToMany
	@JoinColumn(name = "sidfk")
	private Set<Book> bobs;

	public Student() {

	}

	public Student(Integer sid, String sname, Set<Book> bobs) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.bobs = bobs;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set<Book> getBobs() {
		return bobs;
	}

	public void setBobs(Set<Book> bobs) {
		this.bobs = bobs;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", bobs=" + bobs + "]";
	}

}
