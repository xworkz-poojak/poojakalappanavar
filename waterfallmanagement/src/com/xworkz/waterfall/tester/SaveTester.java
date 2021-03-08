package com.xworkz.waterfall.tester;

import com.xworkz.waterfall.dao.WaterFallDAO;
import com.xworkz.waterfall.dao.WaterFallDAOImpl;
import com.xworkz.waterfall.entity.WaterFallEntity;

public class SaveTester {
	public static void main(String[] args) {
		WaterFallEntity entity = new WaterFallEntity();
		entity.setDepth(10000);
		entity.setDestination("down");
		entity.setElectricityGenerated(false);
		entity.setEntryFees(100);
		entity.setHeight(1120);
		entity.setLocation("shivmoga");
		entity.setName("Kunchijkal");
		entity.setNoOfDeath(3);
		entity.setNoOfVisitors(2000);
		entity.setRating(5);
		entity.setSourceRiver("top");
		
		WaterFallDAO dao=new WaterFallDAOImpl();
		dao.create(entity);
	}

}
