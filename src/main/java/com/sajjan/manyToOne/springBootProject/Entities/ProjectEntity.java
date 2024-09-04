package com.sajjan.manyToOne.springBootProject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProjectTab")
public class ProjectEntity {
	@Id
	private Integer projectId;
	private String projectName;

	public ProjectEntity() {
	}

	public ProjectEntity(Integer projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "ProjectEntity [projectId=" + projectId + ", projectName=" + projectName + "]";
	}

}
