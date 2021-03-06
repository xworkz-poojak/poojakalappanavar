package com.xworkz.bag.entity;

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
@Table(name="bag")
public class BagEntity {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="ID")
	private int id;
	@Column(name="BRAND")
	private String brand;
	@Column(name="TYPES_OF_BAGS")
	private String typesOfBags;
	@Column(name="COLOUR")
	private String colour;
	@Column(name="SIZE")
	private int size;
	
	public BagEntity(String brand, String typesOfBags, String colour, int size) {
		super();
		this.brand = brand;
		this.typesOfBags = typesOfBags;
		this.colour = colour;
		this.size = size;
	}
	
	

}
