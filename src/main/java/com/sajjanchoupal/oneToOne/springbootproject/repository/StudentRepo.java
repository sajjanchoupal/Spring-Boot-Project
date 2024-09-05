package com.sajjanchoupal.oneToOne.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sajjanchoupal.oneToOne.springbootproject.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
