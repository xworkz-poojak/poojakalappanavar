package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

@Entity
@Table(name="state")
public class StateEntity {
	
	

	@Id
	@Column(name="ID")
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="LANGUAGE")
	private String language;
	@Column(name="POPULATION")
	private int population;
	@Column(name="NO_OF_District")
	private int noOfDistrict;
	public StateEntity(String name, String language, int population, int noOfDistrict) {
		super();
		this.name = name;
		this.language = language;
		this.population = population;
		this.noOfDistrict = noOfDistrict;
	}
	
	

}
