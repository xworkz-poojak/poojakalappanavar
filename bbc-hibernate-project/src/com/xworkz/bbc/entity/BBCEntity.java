package com.xworkz.bbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

@Entity
@Table(name = "BBC")
public class BBCEntity {
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SEASON_NO")
	private int seasonNo;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "NO_OF_TASKS")
	private int noOfTasks;
	@Column(name = "CONTESTANT_TYPE")
	private String contestantType;
	@Column(name = "DAYS_IN")
	private int daysIn;
}
