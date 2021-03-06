package com.xworkz.bag.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.bag.dao.BagDAO;
import com.xworkz.bag.dao.BagDAOImpl;
import com.xworkz.bag.entity.BagEntity;

public class CreatelistTester {
public static void main(String[] args) {
	BagEntity entity = new BagEntity("Pride","Laugage bag","blue",5);
	BagEntity entity2=new BagEntity("SkyBlue","college Bag","voilet",6);
	BagEntity entity3=new BagEntity("Pomo","Bottle bag","white",8);
	
	List<BagEntity> listEntity=new ArrayList<BagEntity>();
	listEntity.add(entity);
	listEntity.add(entity2);
	listEntity.add(entity3);
	
	BagDAO dao=new BagDAOImpl(listEntity);
	dao.create(entity);
	dao.create(listEntity);

}
}
