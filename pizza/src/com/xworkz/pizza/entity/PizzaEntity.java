package com.xworkz.pizza.entity;

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
@Table(name = "pizza")
public class PizzaEntity {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "TYPES_OF_PIZZA")
	private String typesOfPizza;
	@Column(name = "PIZZA_HUT_NAME")
	private String pizzaHutName;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "RATING")
	private int rating;

	public PizzaEntity(String typesOfPizza, String pizzaHutName, String location, int rating) {
		super();
		this.typesOfPizza = typesOfPizza;
		this.pizzaHutName = pizzaHutName;
		this.location = location;
		this.rating = rating;
	}

}
