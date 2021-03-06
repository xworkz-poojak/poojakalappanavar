package com.xworkz.bag.tester;

import com.xworkz.bag.dao.BagDAO;
import com.xworkz.bag.dao.BagDAOImpl;
import com.xworkz.bag.entity.BagEntity;

public class CreateTester {
public static void main(String[] args) {
	

BagEntity entity = new BagEntity();
entity.setBrand("Adidas");
entity.setColour("black");
entity.setSize(3);
entity.setTypesOfBags("school bag");

BagEntity entity1 = new BagEntity();
entity1.setBrand("Sky");
entity1.setColour("purple");
entity1.setSize(6);
entity1.setTypesOfBags("tour bag");

BagDAO dao=new BagDAOImpl();
dao.create(entity);
dao.create(entity1);


}
}
