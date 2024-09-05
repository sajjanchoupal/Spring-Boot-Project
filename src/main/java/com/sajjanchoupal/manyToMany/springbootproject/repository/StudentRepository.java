package com.sajjanchoupal.manyToMany.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sajjanchoupal.manyToMany.springbootproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
