package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Student {
	
	
	@Id
	private int id;
	@Setter
	@Getter
	private String name;
	
	@Setter
	@Getter
	private String address;
	@Setter
	@Getter
	private String username;
	@Setter
	@Getter
	private String password;
	
    @OneToOne(cascade = CascadeType.MERGE)
	private School school;
}
