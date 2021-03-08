package com.xworkz.pizza.tester;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.pizza.dao.PizzaDAO;
import com.xworkz.pizza.dao.PizzaDAOImpl;
import com.xworkz.pizza.entity.PizzaEntity;
import com.xworkz.pizza.util.PizzaUtil;

public class CreateTester {
	public static void main(String[] args) {
	PizzaEntity entity=new PizzaEntity();
	entity.setPizzaHutName("Dominos");
	entity.setTypesOfPizza("Corn veg pizza");
	entity.setLocation("Bangalore");
	entity.setRating(5);
	
	PizzaEntity entity1=new PizzaEntity();
	entity1.setPizzaHutName("pizzaHut");
	entity1.setTypesOfPizza("margranita pizza");
	entity1.setLocation("rajajiNagar");
	entity1.setRating(4);
	
	List<PizzaEntity> listEntity=new ArrayList<PizzaEntity>();
	listEntity.add(entity);
	listEntity.add(entity1);
	
	PizzaDAO  dao=new PizzaDAOImpl(listEntity);
	dao.create(listEntity);
	}

}
