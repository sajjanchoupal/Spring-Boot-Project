package com.sajjan.manyToOne.springBootProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sajjan.manyToOne.springBootProject.Entities.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer>{

}
