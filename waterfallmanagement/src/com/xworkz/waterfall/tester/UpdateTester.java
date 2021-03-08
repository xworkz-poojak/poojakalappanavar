package com.xworkz.waterfall.tester;

import com.xworkz.waterfall.dao.WaterFallDAO;
import com.xworkz.waterfall.dao.WaterFallDAOImpl;

public class UpdateTester {
	public static void main(String[] args) {
		new WaterFallDAOImpl().updateHeightAndDepthById(3, 2000, 3000);
	}

}
