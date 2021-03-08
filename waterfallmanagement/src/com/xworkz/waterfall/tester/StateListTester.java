package com.xworkz.waterfall.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.waterfall.dao.StateDAO;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.entity.StateEntity;

public class StateListTester {
	public static void main(String[] args) {
		StateEntity stateEntity=new StateEntity();
		stateEntity.setName("Karnataka");
		stateEntity.setLanguage("kannada");
		stateEntity.setPopulation(3000);
		stateEntity.setNoOfDistrict(31);
	//StateEntity entity=new StateEntity();
	
		
		List<StateEntity> listEntity=new ArrayList<StateEntity>();
		//listEntity.add(entity);
		listEntity.add(stateEntity);
		
		StateDAO dao=new StateDAOImpl(listEntity);
		dao.create(listEntity);
	}

}
