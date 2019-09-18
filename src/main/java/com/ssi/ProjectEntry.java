package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ProjectEntry {

	public static void main(String[] args) {

		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();

		Project p1 = new Project("p111", "P_01", 55000);
		Project p2 = new Project("p112", "P_11", 75000);
		Project p3 = new Project("p113", "P_21", 85000);
		Project p4 = new Project("p114", "P_31", 195000);

		Transaction tr = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");

	}

}
