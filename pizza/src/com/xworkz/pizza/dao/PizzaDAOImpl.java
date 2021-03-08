package com.xworkz.pizza.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pizza.entity.PizzaEntity;

import com.xworkz.pizza.util.PizzaUtil;

public class PizzaDAOImpl implements PizzaDAO {

	SessionFactory factory = PizzaUtil.getFactory();
	
	public PizzaDAOImpl() {
		
	}

	public PizzaDAOImpl(List<PizzaEntity> listEntity) {

	}

	@Override
	public PizzaEntity create(PizzaEntity entity) {
		System.out.println("invoked");
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(PizzaEntity.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		return entity;

	}

	@Override
	public void create(List<PizzaEntity> entity) {
		System.out.println("invoked");
		Transaction transaction = null;
		try {

			Session session = factory.openSession();

			transaction = session.beginTransaction();
			for (PizzaEntity pizzaEntity : entity) {
				session.save(pizzaEntity);
				System.out.println(pizzaEntity);
			}
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}

	}

	@Override
	public void updatePizzaHutNameById(int id, String pizzaHutName) {
		System.out.println("invoked");
	try{
		Session session=factory.openSession();
	
		Transaction transaction=session.beginTransaction();
		PizzaEntity entity=session.get(PizzaEntity.class, id);
		if(entity!=null){
			System.out.println("can update for id"+id);
		    entity.setPizzaHutName(pizzaHutName);
		    session.update(entity);
		    transaction.commit();
		
		}
	}catch(Exception e){
		System.out.println("cannot update");
	}
	}

	@Override
	public void getById(int id) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		PizzaEntity entity=session.get(PizzaEntity.class, id);
		if(entity!=null){
			System.out.println("can get for id" +id);
			System.out.println(entity);
			transaction.commit();
		}else{
			System.out.println("can not get");
		}
		
	}

	@Override
	public List<PizzaEntity> getAll() {
		List<PizzaEntity> list = new ArrayList<PizzaEntity>();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		for (int i = 0; i < 3; i++) {
			PizzaEntity entity=session.get(PizzaEntity.class, i);
			list.add(entity);
			
		}
		
		
		return list;
	}

	@Override
	public void deleteAll() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		for(int i=2;i<4;i++){
			PizzaEntity entity=session.get(PizzaEntity.class, i);
			session.delete(entity);
		}
			transaction.commit();
			System.out.println("deleted");
		
		
	}

	

}
