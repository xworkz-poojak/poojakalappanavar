package com.xworkz.stationary.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.stationary.entity.Items_Of_Stationary;

public class StationaryDAOImpl implements StationaryDAO {

	
	public StationaryDAOImpl() {
		System.out.println("created");
	}
	@Override
	public void create(Items_Of_Stationary items) {
		System.out.println("invoked");
		System.out.println("items"+items);
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Items_Of_Stationary.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
	    Transaction transaction=session.beginTransaction();
	session.save(items);
	transaction.commit();
	factory.close();
	session.close();
	
	}

}
