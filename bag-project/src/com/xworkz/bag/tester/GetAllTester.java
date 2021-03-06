package com.xworkz.bag.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.bag.dao.BagDAO;
import com.xworkz.bag.dao.BagDAOImpl;
import com.xworkz.bag.entity.BagEntity;

public class GetAllTester {
public static void main(String[] args) {
	List<BagEntity> list=new ArrayList<BagEntity>();
 BagDAO dao=	new BagDAOImpl(list);
 dao.getAll();
	System.out.println("printed all");
}
}
