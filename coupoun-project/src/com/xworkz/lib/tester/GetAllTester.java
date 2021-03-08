package com.xworkz.lib.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.lib.dao.CoupounDAO;
import com.xworkz.lib.dao.CoupounDAOImpl;
import com.xworkz.lib.entity.CoupounEntity;

public class GetAllTester {
public static void main(String[] args) {
	List<CoupounEntity> list=new ArrayList<CoupounEntity>();
	CoupounDAO dao=new CoupounDAOImpl(list);
	dao.getAll();
	System.out.println("got all");
}
}
