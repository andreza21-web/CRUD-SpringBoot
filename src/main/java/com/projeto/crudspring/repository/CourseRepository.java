package com.projeto.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.crudspring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
