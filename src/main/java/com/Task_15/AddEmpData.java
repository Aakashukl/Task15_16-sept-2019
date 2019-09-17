package com.Task_15;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Task_15.Util;

public class AddEmpData {

	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();

		Emp e1 = new Emp(1, "chirag", 2500, new Laptop("L111"),new Vehicle(1));
		Emp e2 = new Emp(2, "shivam", 500, new Laptop("L112"),new Vehicle(2));
		Emp e3 = new Emp(3, "manav", 200, new Laptop("L113"),new Vehicle(3));
		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		tr.commit();
		session.close();
		System.out.println("Saved");
	}

}
