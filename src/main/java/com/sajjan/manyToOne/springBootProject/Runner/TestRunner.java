package com.sajjan.manyToOne.springBootProject.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sajjan.manyToOne.springBootProject.Entities.ProjectEntity;
import com.sajjan.manyToOne.springBootProject.Entities.StudentEntity;
import com.sajjan.manyToOne.springBootProject.Repositories.ProjectRepository;
import com.sajjan.manyToOne.springBootProject.Repositories.StudentRepository;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public void run(String... args) throws Exception {
		ProjectEntity p1=new ProjectEntity(101,"AAA");
		ProjectEntity p2=new ProjectEntity(102,"ADS");
		projectRepository.save(p1);
		projectRepository.save(p2);
	
	StudentEntity s1=new StudentEntity(10, "Sajjan Choupal",750000,"New Delhi", p1);
	StudentEntity s2=new StudentEntity(11, "Mohan Jha",600000,"Mumbai", p1);
	StudentEntity s3=new StudentEntity(12, "Mukesh Jha",750000,"Pune", p2);
	StudentEntity s4=new StudentEntity(13, "Shashwat Tiwari",750000,"Hyderabad", p2);
	studentRepository.save(s1);
	studentRepository.save(s2);
	studentRepository.save(s3);
	studentRepository.save(s4);
}
}
