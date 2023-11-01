package com.hexagon.studentservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexagon.studentservice.dto.School;
import com.hexagon.studentservice.entity.Student;
import com.hexagon.studentservice.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private RestTemplate  restTemplate;
	
	public ResponseEntity<?> createStudent(Student student){
		try {			
			return new ResponseEntity<Student>(studentRepository.save(student), HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	
	
	
}
