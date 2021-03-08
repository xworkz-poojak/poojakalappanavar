package com.xworkz.bbc.tester;

import com.xworkz.bbc.dao.BBCDAO;
import com.xworkz.bbc.dao.BBCDAOImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class BBCGetTester {
	public static void main(String[] args) {
		BBCDAO dao=new BBCDAOImpl();
		BBCEntity entity=dao.getById(2);
		System.out.println(entity);
	}

}
