package com.hexagon.schoolservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "school")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String schoolName;
	private String location;
	private String principalName;
}
