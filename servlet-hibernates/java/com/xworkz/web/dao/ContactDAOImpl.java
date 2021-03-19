package com.xworkz.web.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.web.entity.ContactEntity;


import util.SFUtil;

public class ContactDAOImpl implements ContactDAO {

	private SessionFactory factory=SFUtil.getFactory();

	@Override
	public void save(ContactEntity entity) {
		Transaction tx=null;
		Session session=null;
		
			try(Session session1=factory.openSession()){
				Transaction tx1=session1.beginTransaction();
				session1.save(entity);
				tx1.commit();
			}
	}
	}


