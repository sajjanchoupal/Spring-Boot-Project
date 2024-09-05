package com.sajjanchoupal.oneToOne.springbootproject.TestRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sajjanchoupal.oneToOne.springbootproject.entity.Book;
import com.sajjanchoupal.oneToOne.springbootproject.entity.Student;
import com.sajjanchoupal.oneToOne.springbootproject.repository.BookRepo;
import com.sajjanchoupal.oneToOne.springbootproject.repository.StudentRepo;

@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
private StudentRepo studentRepo;
	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Book b1=new Book(10, "Core Java");
		Book b2=new Book(20, "Springboot");
		Book b3=new Book(30, "Hibernate");
		
		bookRepo.save(b1);
		bookRepo.save(b2);
		bookRepo.save(b3);
		
		Student s1= new Student(101,"Sajjan Choupal", b1);
		Student s2= new Student(102,"Mohan Jha", b2);
		Student s3= new Student(103,"Sohan Singh", b3);
		
	    studentRepo.save(s1);
	    studentRepo.save(s2);
	    studentRepo.save(s3);
		
	}

}
