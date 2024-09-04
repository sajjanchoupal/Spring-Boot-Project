package com.sajjanchoupal.oneToMany.springboot.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sajjanchoupal.oneToMany.springboot.project.entities.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
