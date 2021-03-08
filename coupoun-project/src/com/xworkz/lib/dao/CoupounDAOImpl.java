package com.xworkz.lib.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.lib.entity.CoupounEntity;

import util.SFUtil;

public class CoupounDAOImpl implements CoupounDAO {
	private SessionFactory factory = SFUtil.getFactory();

	public CoupounDAOImpl(List<CoupounEntity> list) {
		// TODO Auto-generated constructor stub
	}

	public CoupounDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(CoupounEntity entity) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();

	}

	@Override
	public void create(List<CoupounEntity> entities) {
		try {
			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();
			for (CoupounEntity coupounEntity : entities) {
				session.save(coupounEntity);
				System.out.println("added");
			}
			transaction.commit();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateValidateInMonthAndCodeById(int id, int validateInMonths, int code) {
		try {
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			CoupounEntity entity = session.get(CoupounEntity.class, id);
			if (entity != null) {
				System.out.println("can update foe id" + id);
				entity.setCode(code);
				entity.setValidateInMonths(validateInMonths);
				session.update(entity);
			}
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getById(int id) {
		try(Session session=factory.openSession()){
			Transaction transaction=session.beginTransaction();
			CoupounEntity entity=session.get(CoupounEntity.class, id);
			if(entity!=null){
				System.out.println("can get entity for"+ id);
				System.out.println(entity);
				
			}
			transaction.commit();
		}
	}

	@Override
	public List<CoupounEntity> getAll() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<CoupounEntity> entities=new ArrayList<CoupounEntity>();
		for (int i = 1; i < 4; i++) {
			CoupounEntity entity=session.get(CoupounEntity.class, i);
			entities.add(entity);
		
			
		}
		transaction.commit();
		return entities;
	}

	@Override
	public void deleteAll() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		for (int i = 1; i < 3; i++) {
			CoupounEntity entity=session.get(CoupounEntity.class, i);
			session.delete(entity);
		}
		transaction.commit();
	}
}