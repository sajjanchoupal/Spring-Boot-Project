package com.sajjanchoupal.oneToMany.springboot.project.entities;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sajjanchoupal.oneToMany.springboot.project.repositories.BookRepo;
import com.sajjanchoupal.oneToMany.springboot.project.repositories.StudentRepo;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private BookRepo bookRepo;

	@Override
	public void run(String... args) throws Exception {
		Book b1=new Book(101, "Java");
		Book b2=new Book(102, "Spring");
		
		bookRepo.save(b1);
		bookRepo.save(b2);
		
		Set<Book> s1= Set.of(b1,b2);
		
		Student stu=new Student(10, "Sajjan Chupal", s1);
		studentRepo.save(stu);
		
	}

}
