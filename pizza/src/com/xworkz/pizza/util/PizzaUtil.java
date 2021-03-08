package com.xworkz.pizza.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PizzaUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;

	}

	static {
		try {
			System.out.println("invoked");
			Configuration cfg = new Configuration();
			cfg.configure();
			// cfg.addAnnotatedClass(annotatedClass);
			factory = cfg.buildSessionFactory();
			if (factory != null) {
				System.out.println("pizzaUtill can be created");
			} else {
				throw new SingleTonPizzaException();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
