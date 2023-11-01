package com.hexagon.studentservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hexagon.studentservice.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
