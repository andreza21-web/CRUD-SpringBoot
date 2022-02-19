package com.projeto.crudspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name= "cursos")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 200, nullable = false)
	private String name;

	@Column(length = 10, nullable = false)
	private String category;
	
	public Course(Long id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
	}
	
	

	public Course() {
		super();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
