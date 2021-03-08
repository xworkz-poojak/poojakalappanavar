package com.xworkz.lib;

import org.hibernate.SessionFactory;

import util.SFUtil;

public class SFTester {
	public static void main(String[] args) {
		SessionFactory factory=SFUtil.getFactory();
		System.out.println(factory);
	}

}
