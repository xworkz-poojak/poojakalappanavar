package com.xworkz.pizza.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.pizza.dao.PizzaDAOImpl;
import com.xworkz.pizza.entity.PizzaEntity;

public class GetAllTester {
	public static void main(String[] args) {
		List<PizzaEntity> list=new ArrayList<PizzaEntity>();
		list=new PizzaDAOImpl().getAll();
		System.out.println(list);
	}

}
