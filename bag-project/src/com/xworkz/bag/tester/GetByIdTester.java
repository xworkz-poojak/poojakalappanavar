package com.xworkz.bag.tester;

import com.xworkz.bag.dao.BagDAOImpl;

public class GetByIdTester {
public static void main(String[] args) {
	new BagDAOImpl().getById(2);
	System.out.println("printed");
}
}
