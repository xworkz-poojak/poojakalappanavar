package com.xworkz.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="contact")

public class ContactEntity {
	@Id
	
	@GenericGenerator(name="bus",strategy="increment")
	@GeneratedValue(generator="bus")
	@Column(name="ID")
	
	
	private int id;
	@Column(name="NAME")

	private String name;
	@Column(name="PHONENO")

	private String no;
	@Column(name="COMPANY")

	private String company;
	@Column(name="TEXT")

	private String text;
	@Column(name="EMAIL")

	private String email;
	
	

}
