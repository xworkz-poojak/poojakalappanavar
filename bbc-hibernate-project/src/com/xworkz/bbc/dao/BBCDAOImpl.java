package com.xworkz.bbc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bbc.entity.BBCEntity;

public class BBCDAOImpl implements BBCDAO {

	public BBCDAOImpl() {
	System.out.println("created");
	}
	
	@Override
	public void create(BBCEntity entity) {
		System.out.println("invoked");
		System.out.println("Entity"+entity);
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(entity);
		transaction.commit();
		factory.close();
		session.close();
		
	}

	@Override
	public BBCEntity getById(int id) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		BBCEntity entityFromId=session.get(BBCEntity.class, id);
		transaction.commit();
		factory.close();
		session.close();
		return entityFromId;
	}

	@Override
	public BBCEntity updateNoOfTaskAndDaysInById(int id ,int noOfTasks,int daysIn) {
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(BBCEntity.class).buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BBCEntity entityFromId=session.get(BBCEntity.class, id);
		if(entityFromId!=null){
			System.out.println("can update the class for"+id);
			entityFromId.setNoOfTasks(noOfTasks);
			entityFromId.setDaysIn(daysIn);
			session.update(entityFromId);
			transaction.commit();
		}else{
			System.out.println("cannot update as class is not there");
		}
		factory.close();
		session.close();
		return entityFromId;
	}

	@Override
	public void deletById(int id) {
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(BBCEntity.class).buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BBCEntity entityFromId=session.get(BBCEntity.class, id);
		
		if(entityFromId!=null){
			System.out.println("can delet"+id);
			session.delete(entityFromId);
			transaction.commit();
			
		}else{
			System.out.println("connot delete");
		}
		factory.close();
		session.close();
	}

}
