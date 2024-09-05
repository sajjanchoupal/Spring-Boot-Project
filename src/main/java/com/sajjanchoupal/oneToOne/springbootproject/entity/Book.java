package com.sajjanchoupal.oneToOne.springbootproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Book {
	@Id
	private Integer bid;
	private String bname;
	
	public Book() {

	}

	public Book(Integer bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	
	

}
