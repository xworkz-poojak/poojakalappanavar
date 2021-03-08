package com.xworkz.waterfall.tester;

import com.xworkz.waterfall.dao.WaterFallDAOImpl;

public class GetByIdTester {
public static void main(String[] args) {
	new WaterFallDAOImpl().getById(3);
}
}
