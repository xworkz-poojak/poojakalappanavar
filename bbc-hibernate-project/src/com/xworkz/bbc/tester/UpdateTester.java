package com.xworkz.bbc.tester;

import com.xworkz.bbc.dao.BBCDAOImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class UpdateTester {
	public static void main(String[] args) {
		BBCEntity bbcEntity=new BBCDAOImpl().updateNoOfTaskAndDaysInById(1,5,5);
	 System.out.println(bbcEntity);
	
	}

}
