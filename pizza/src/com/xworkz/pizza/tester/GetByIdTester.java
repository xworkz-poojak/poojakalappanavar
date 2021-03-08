package com.xworkz.pizza.tester;

import com.xworkz.pizza.dao.PizzaDAOImpl;

public class GetByIdTester {

	public static void main(String[] args) {
		new PizzaDAOImpl().getById(2);
	}
}
