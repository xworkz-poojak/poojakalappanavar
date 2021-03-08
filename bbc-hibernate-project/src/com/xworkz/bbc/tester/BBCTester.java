package com.xworkz.bbc.tester;

import com.xworkz.bbc.dao.BBCDAO;
import com.xworkz.bbc.dao.BBCDAOImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class BBCTester {
	public static void main(String[] args) {
		BBCEntity entity = new BBCEntity();
		//entity.setId(2);
		entity.setContestantType("common contestant");
		entity.setDaysIn(1);
		entity.setGender("Female");
		entity.setName("rohila");
		entity.setNoOfTasks(3);
		entity.setSeasonNo(2);

		BBCEntity entity1 = new BBCEntity();
		//entity1.setId(3);
		entity1.setContestantType("celebrate");
		entity1.setDaysIn(3);
		entity1.setGender("Female");
		entity1.setName("rome");
		entity1.setNoOfTasks(3);
		entity1.setSeasonNo(2);

		BBCDAO dao = new BBCDAOImpl();
		dao.create(entity);
		dao.create(entity1);
		dao.create(entity);
		dao.create(entity);
		dao.create(entity);
		dao.create(entity1);
		dao.create(entity1);
	}

}
