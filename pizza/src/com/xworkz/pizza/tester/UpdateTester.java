package com.xworkz.pizza.tester;

import com.xworkz.pizza.dao.PizzaDAOImpl;

public class UpdateTester {
public static void main(String[] args) {
	new PizzaDAOImpl().updatePizzaHutNameById(1, "lakshmiPizza");
}
}
