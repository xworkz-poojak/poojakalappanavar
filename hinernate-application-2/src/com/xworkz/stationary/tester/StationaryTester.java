package com.xworkz.stationary.tester;

import com.xworkz.stationary.dao.StationaryDAO;
import com.xworkz.stationary.dao.StationaryDAOImpl;
import com.xworkz.stationary.entity.Items_Of_Stationary;

public class StationaryTester {
public static void main(String[] args) {
	Items_Of_Stationary stationary=new Items_Of_Stationary( );
	stationary.setId(1);
	stationary.setShopName("maya");
	stationary.setTypesOfBooks("10");
	stationary.setTypesOfPens("25");
	stationary.setCraftThings("colour papers");
	
	StationaryDAO dao=new StationaryDAOImpl();
	dao.create(stationary);

}
}