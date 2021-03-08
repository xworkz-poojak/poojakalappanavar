package com.xworkz.waterfall.tester;

import com.xworkz.waterfall.dao.WaterFallDAOImpl;

public class DeleteTester {
public static void main(String[] args) {
	new WaterFallDAOImpl().deleteById(1);
}
}
