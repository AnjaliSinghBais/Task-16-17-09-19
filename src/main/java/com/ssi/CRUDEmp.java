package com.ssi;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class CRUDEmp {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Laptop l1 = (Laptop) session.get(Laptop.class, "L111");
		l1.setBrand("HCl");
		Transaction tr = session.beginTransaction();
		session.update(l1);
		tr.commit();
		session.close();
		System.out.println("RECORD UPDATED");

		// session.delete(l1);
		// tr.commit();
		// session.close();
		// System.out.println("RECORD DELETED");

		/*
		 * Laptop laptop=new Laptop(); laptop.setCode("L116");
		 * laptop.setBrand("HCL"); laptop.setPrice(80000); session.save(laptop);
		 * tr.commit(); System.out.println("Inserted Successfully");
		 * 
		 * 
		 * /*Laptop laptop=new Laptop("L115"); session.delete(laptop);
		 * 
		 * tr.commit(); System.out.println("Laptop deleted");
		 */
		// System.out.println("Update row");
		// Laptop laptop=session.get(Laptop.class,"L114");
		// laptop.setBrand("Lenovo");
		// session.update(laptop);
		// tr.commit();
		// System.out.println("Updated");

	}

}
