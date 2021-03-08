package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallEntity;
import com.xworkz.waterfall.util.SFUtil;

public class WaterFallDAOImpl implements WaterFallDAO {

	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public void create(WaterFallEntity entity) {
		System.out.println("invoked");
		System.out.println("entity" + entity);

		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
		}
	}

	@Override
	public void deleteById(int id) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallEntity entity = session.get(WaterFallEntity.class, id);
			if (entity != null) {
				System.out.println("can delete for  id" + id);
				session.delete(entity);
				transaction.commit();

			} else {
				System.out.println("cannot delete");
			}
		}
	}

	@Override
	public void updateHeightAndDepthById(int id, double height, double depth) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallEntity entityFroomId = session.get(WaterFallEntity.class, id);
			if (entityFroomId != null) {
				System.out.println("can update for  id" + id);
				entityFroomId.setHeight(height);
				entityFroomId.setDepth(depth);
				session.update(entityFroomId);
				transaction.commit();

			}
		}
	}

	@Override
	public WaterFallEntity getById(int id) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallEntity entity = session.get(WaterFallEntity.class, id);
			System.out.println(entity);
			transaction.commit();
			return entity;
		}
	}

	@Override
	public void create(WaterFallEntity entity, StateEntity stateEntity) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			session.flush();
			session.save(stateEntity);
			transaction.commit();
		}
	}
}
