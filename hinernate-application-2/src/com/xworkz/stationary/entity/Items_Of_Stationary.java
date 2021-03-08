package com.xworkz.stationary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

@Entity
@Table(name="ITEMS_IN_STATIONARY")

public class Items_Of_Stationary {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="SHOP_NAME")
	private String shopName;
	@Column(name="TYPES_OF_BOOKS")
	private String typesOfBooks;
	@Column(name="TYPES_OF_PENS")
	private String typesOfPens;
	@Column(name="CRAFT_THINGS")
	private String craftThings;
	

}
