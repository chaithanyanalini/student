package com.example.StudentCurd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentCurd.domain.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
