package com.xworkz.bag.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bag.entity.BagEntity;
import com.xworkz.bag.util.BagUtil;

public class BagDAOImpl implements BagDAO {

	SessionFactory factory=BagUtil.getFactory();
	
	public BagDAOImpl() {
		System.out.println("constructor created");
	}
	
	public BagDAOImpl(List<BagEntity> listEntity) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BagEntity create(BagEntity entity) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BagEntity.class);
	SessionFactory factory=	cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	session.save(entity);
	transaction.commit();
		return entity;
	}

	@Override
	public void create(List<BagEntity> entity) {
		System.out.println("invoked");
	try{
		Session session	=factory.openSession();
	
	Transaction transaction=session.beginTransaction();
	for (BagEntity bagEntity : entity) {
		session.save(bagEntity);
		System.out.println(bagEntity);
		
	}
	transaction.commit();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	}

	@Override
	public void updateBrandAndColourById(int id, String brand, String colour) {
		System.out.println("invoked update");
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BagEntity entity=session.get(BagEntity.class, id);
		if(entity!=null){
			System.out.println("can update for id" +id);
			
		}
		
	}

	@Override
	public void getById(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BagEntity entity=session.get(BagEntity.class, id);
		if(entity!=null){
			System.out.println(entity);
			
		}
		transaction.commit();
	}

	@Override
	public List<BagEntity> getAll() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<BagEntity> list=new ArrayList<BagEntity>();

		for (int i = 1; i < 5; i++) {
			BagEntity entity=session.get(BagEntity.class, i);
			list.add(entity);
			
		}
		transaction.commit();
		return list;
	}

	@Override
	public void deleteById(int id) {
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	
		BagEntity entity=session.get(BagEntity.class, id);
		if(entity!=null){
			System.out.println("can delete for id"+ id);
		session.delete(entity);
		}
		transaction.commit();
	}

	@Override
	public void deleteAll() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		//List<BagEntity> entity=new ArrayList<BagEntity>();
		for (int i = 3; i < 6; i++) {
			BagEntity entity=session.get(BagEntity.class, i);
			session.delete(entity);
			
		}
		transaction.commit();
	}

}
