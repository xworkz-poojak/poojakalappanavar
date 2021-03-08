package com.xworkz.lib.tester;

import com.xworkz.lib.dao.CoupounDAOImpl;

public class UpdateTester {

	public static void main(String[] args) {
new CoupounDAOImpl().updateValidateInMonthAndCodeById(3, 9, 8);
System.out.println("updated successfully");
	}

}
