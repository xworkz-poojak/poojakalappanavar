package com.xworkz.bag.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class BagUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;

	}

	static {
		
			Configuration cfg = new Configuration();
			cfg.configure();
			// cfg.addAnnotatedClass(annotatedClass)
		try{
			 factory = cfg.buildSessionFactory();
			if (factory!= null) {
				System.out.println(" can create");
			} else {
				throw new SingletonException();
			}

		} catch (Exception e) {

		 throw new SingletonException();
		}

	}
}