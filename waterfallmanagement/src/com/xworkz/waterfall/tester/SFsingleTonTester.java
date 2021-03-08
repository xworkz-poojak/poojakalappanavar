package com.xworkz.waterfall.tester;

import org.hibernate.SessionFactory;

import com.xworkz.waterfall.util.SFUtil;

public class SFsingleTonTester {
	public static void main(String[] args) {
		SessionFactory factory=SFUtil.getFactory();
		System.out.println(factory);
	}

}
