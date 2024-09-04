package com.sajjan.manyToOne.springBootProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sajjan.manyToOne.springBootProject.Entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
