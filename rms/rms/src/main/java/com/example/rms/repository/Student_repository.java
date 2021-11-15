package com.example.rms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rms.entity.Student_entity;

@Repository
public interface Student_repository extends JpaRepository<Student_entity, String>{
	Student_entity findByEmail(String email);
}
