package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaptopSearch {

	public static void main(String[] args) {

		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Laptop laptop = (Laptop) session.get(Laptop.class, "L111");
		System.out.println(laptop.getCode());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getPrice());

	}
}
