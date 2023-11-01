package com.hexagon.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexagon.studentservice.service.StudentService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService; 
	

}
