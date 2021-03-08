package com.xworkz.lib.entity;

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
@Table(name="coupoun")
public class CoupounEntity {
	
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="CID")
private int cid;
	@Column(name="NAME")
private String name;
	@Column(name="TYPE")
private String type;
	@Column(name="CODE")
private int code;
	@Column(name="VALIDATE_IN_MONTHS")
private int validateInMonths;
	
	public CoupounEntity(String name, String type, int code, int validateInMonths) {
		super();
		this.name = name;
		this.type = type;
		this.code = code;
		this.validateInMonths = validateInMonths;
	}
	

}
