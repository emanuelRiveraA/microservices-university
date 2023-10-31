package com.hexagon.schoolservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hexagon.schoolservice.SchoolService;

@RestController
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;

}
