package com.xworkz.pizza.tester;

import com.xworkz.pizza.dao.PizzaDAO;
import com.xworkz.pizza.dao.PizzaDAOImpl;

public class DeleteAllTester {
public static void main(String[] args) {
	new PizzaDAOImpl().deleteAll();
}
}
