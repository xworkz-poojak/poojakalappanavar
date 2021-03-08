package com.xworkz.pizza.dao;

import java.util.List;

import com.xworkz.pizza.entity.PizzaEntity;

public interface PizzaDAO {
	
	public PizzaEntity create(PizzaEntity entity);
	
	public void create(List<PizzaEntity> entity);
	
	public void getById(int id);
	
	public void updatePizzaHutNameById(int id,String pizzaHutName);
	
	public List<PizzaEntity> getAll();
	
	public void deleteAll();

}
