package com.hexagon.schoolservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexagon.schoolservice.entity.School;
import com.hexagon.schoolservice.repository.SchoolRepository;

@Service
public class SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	public School addSchool(School school) {
		return schoolRepository.save(school);
	}
	
	public List<School> fetchSchools() {
		return schoolRepository.findAll();
	}
	
	public Optional<School> fetchSchoolById(int id) {
		return schoolRepository.findById(id);
	}
}
