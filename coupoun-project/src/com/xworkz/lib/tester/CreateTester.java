package com.xworkz.lib.tester;

import com.xworkz.lib.dao.CoupounDAOImpl;
import com.xworkz.lib.entity.CoupounEntity;

public class CreateTester {
	public static void main(String[] args) {
		CoupounEntity entity=new CoupounEntity("Zomato","food",1,2);
		
		new CoupounDAOImpl().create(entity);
	}

}
