package com.xworkz.bag.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.bag.dao.BagDAO;
import com.xworkz.bag.dao.BagDAOImpl;
import com.xworkz.bag.entity.BagEntity;

public class DeleteAllTester {
public static void main(String[] args) {
	//List<BagEntity> entity=new ArrayList<BagEntity>();
	BagDAO dao=new BagDAOImpl();
	dao.deleteAll();
	System.out.println("deleted");
}
}
