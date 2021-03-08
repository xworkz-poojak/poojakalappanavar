package com.xworkz.pizza.tester;

import org.hibernate.SessionFactory;

import com.xworkz.pizza.util.PizzaUtil;

public class UtillTester {
	public static void main(String[] args) {
		SessionFactory factory=PizzaUtil.getFactory();
		System.out.println(factory);
	}

}
