package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Generated
@Setter
@ToString
@NoArgsConstructor

@Entity
@Table(name = "waterfalls")
public class WaterFallEntity {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "HEIGHT")
	private double height;
	@Column(name = "DEPTH")
	private double depth;
	@Column(name = "ELECTRICITY_GENERATED")
	private boolean electricityGenerated;
	@Column(name = "SOURCE_RIVER")
	private String sourceRiver;
	@Column(name = "ENTRY_FEES")
	private int entryFees;
	@Column(name = "DESTINATION")
	private String destination;
	@Column(name = "RATING")
	private int rating;
	@Column(name = "NO_OF_DEATH")
	private int noOfDeath;
	@Column(name = "NO_OF_VISITORS")
	private int noOfVisitors;
	public WaterFallEntity(String name, String location, double height, double depth, boolean electricityGenerated,
			String sourceRiver, int entryFees, String destination, int rating, int noOfDeath, int noOfVisitors) {
		super();
		this.name = name;
		this.location = location;
		this.height = height;
		this.depth = depth;
		this.electricityGenerated = electricityGenerated;
		this.sourceRiver = sourceRiver;
		this.entryFees = entryFees;
		this.destination = destination;
		this.rating = rating;
		this.noOfDeath = noOfDeath;
		this.noOfVisitors = noOfVisitors;
	}

	
}
