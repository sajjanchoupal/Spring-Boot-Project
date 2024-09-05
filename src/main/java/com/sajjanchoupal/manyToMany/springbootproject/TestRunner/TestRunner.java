package com.sajjanchoupal.manyToMany.springbootproject.TestRunner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sajjanchoupal.manyToMany.springbootproject.entity.Book;
import com.sajjanchoupal.manyToMany.springbootproject.entity.Student;
import com.sajjanchoupal.manyToMany.springbootproject.repository.BookRepository;
import com.sajjanchoupal.manyToMany.springbootproject.repository.StudentRepository;
@Component
public class TestRunner implements CommandLineRunner {
@Autowired	
private StudentRepository studentRepository;
@Autowired
private BookRepository bookRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		Book b1=new Book(10,"Core Java");
		Book b2=new Book(20,"Spring boot");
		Book b3=new Book(30,"Hibernate");
		
		bookRepository.save(b1);
		bookRepository.save(b2);
		bookRepository.save(b3);
		
		Set<Book> s1=Set.of(b1,b3);
		Set<Book> s2=Set.of(b2,b3);
		
		Student st1=new Student(101,"Rahul",s1 );
		Student st2=new Student(102,"Sajjan",s2 );
		
		studentRepository.save(st1);
		studentRepository.save(st2);
		
	}

}
