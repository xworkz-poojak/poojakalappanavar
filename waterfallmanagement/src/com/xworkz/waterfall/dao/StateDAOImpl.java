package com.xworkz.waterfall.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallEntity;
import com.xworkz.waterfall.util.SFUtil;

public class StateDAOImpl implements StateDAO {

	SessionFactory factory = SFUtil.getFactory();

	public StateDAOImpl(List<StateEntity> listEntity) {

	}

	@Override
	public void create(List<StateEntity> entites) {
		System.out.println("created");
		Transaction transaction = null;
		try {
			Session session = factory.openSession();

			transaction = session.beginTransaction();
			for (StateEntity stateEntity : entites) {
				//session.save(stateEntity);
				session.flush();
			}
			//session.flush();
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
	public void create(WaterFallEntity entity, StateEntity stateEntity) {
		System.out.println("invoked");
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(entity);
		session.save(stateEntity);
		transaction.commit();
	}
}