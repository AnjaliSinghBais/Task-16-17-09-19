package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class EmpEntry {

	public static void main(String[] args) {

		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee employee1 = new Employee(1, "Anjali", 78000, new Laptop("L111"));
		employee1.getPro().add(new Project("p111"));
		employee1.getPro().add(new Project("p113"));

		Employee employee2 = new Employee(2, "Pooja", 67000, new Laptop("L112"));
		employee2.getPro().add(new Project("p114"));
		Employee employee3 = new Employee(3, "Arti", 4000, new Laptop("L113"));
		employee3.getPro().add(new Project("p113"));
		employee3.getPro().add(new Project("p112"));

		// Insertion of data
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);

		tr.commit();
		session.close();
		System.out.println("DATA INSERTED");
	}

}
