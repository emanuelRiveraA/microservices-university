package com.hexagon.schoolservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexagon.schoolservice.SchoolService;
import com.hexagon.schoolservice.entity.School;

@RestController
public class SchoolController {
	
	@Autowired
	private SchoolService schoolService;
	
	@PostMapping
	public School addSchool(@RequestBody School school) {
		return schoolService.addSchool(school);
	}
	
	@GetMapping
	public List<School> fetchSchools() {
		return schoolService.fetchSchools();
	}
	
	@GetMapping("/{id}")
	public Optional<School> fetchSchoolById(@PathVariable int id) {
		return schoolService.fetchSchoolById(id);
	}

}
