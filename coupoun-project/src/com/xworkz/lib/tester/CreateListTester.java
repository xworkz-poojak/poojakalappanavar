package com.xworkz.lib.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.lib.dao.CoupounDAO;
import com.xworkz.lib.dao.CoupounDAOImpl;
import com.xworkz.lib.entity.CoupounEntity;

public class CreateListTester {
	public static void main(String[] args) {
		CoupounEntity entity=new CoupounEntity("swizzy","pizza",2,3);
		CoupounEntity entity1=new CoupounEntity("amazon","food",3,4);
		CoupounEntity entity2=new CoupounEntity("Flipkart","burger",4,5);
		
		List<CoupounEntity> list=new ArrayList<CoupounEntity>();
		list.add(entity);
		list.add(entity1);
		list.add(entity2);
		
		CoupounDAO dao=new CoupounDAOImpl(list);
		dao.create(list);
	}

}
