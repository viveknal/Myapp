package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class School {
	@Id
	@Setter
	@Getter
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String schoolId;
	
	@Setter
	@Getter
	private String schoolName;
	


}
