package com.xworkz.bag.tester;

import org.hibernate.SessionFactory;

import com.xworkz.bag.util.BagUtil;

public class UtilTester {
	public static void main(String[] args) {
		SessionFactory factory=BagUtil.getFactory();
	System.out.println(factory);
	}

}
