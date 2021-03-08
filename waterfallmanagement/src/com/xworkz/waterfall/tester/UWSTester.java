package com.xworkz.waterfall.tester;

import com.xworkz.waterfall.dao.StateDAO;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.dao.WaterFallDAO;
import com.xworkz.waterfall.dao.WaterFallDAOImpl;
import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallEntity;

public class UWSTester {
	public static void main(String[] args) {
		
	
WaterFallEntity water=new WaterFallEntity("Abbe","madikeri",5.5,12300,true,"top",500,"bottom",5,6,1200);
StateEntity entity=new StateEntity("karnataka","kannada",1200,31);

WaterFallDAO dao=new WaterFallDAOImpl();
dao.create(water);



}
}
