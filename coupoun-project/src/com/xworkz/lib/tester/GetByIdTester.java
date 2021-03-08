package com.xworkz.lib.tester;

import com.xworkz.lib.dao.CoupounDAOImpl;

public class GetByIdTester {
	public static void main(String[] args) {
		new CoupounDAOImpl().getById(3);
	}

}
