package com.sajjanchoupal.oneToOne.springbootproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentTab")
public class Student {
	@Id
	private Integer sid;
	private String sname;
	@OneToOne
	@JoinColumn(name="bokFk")
	private Book book;
	
	public Student() {

	}

	public Student(Integer sid, String sname, Book book) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.book = book;
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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", book=" + book + "]";
	}
	
	

}
