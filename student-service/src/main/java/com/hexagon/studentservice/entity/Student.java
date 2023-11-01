package com.hexagon.studentservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Student {

	@Id
	private String id;
	private String name;
	private int age;
	private String gender;
	private Integer schoolId;
}
