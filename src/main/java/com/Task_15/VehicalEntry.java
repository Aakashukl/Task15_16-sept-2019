package com.Task_15;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class VehicalEntry {

	public static void main(String[] main) {
	
	Session session = Util.getSessionFactory().openSession();
	
	Vehicle v1 = new Vehicle(1, "Mahindra", "SUV", 2500000);
	Vehicle v2 = new Vehicle(2, "Renault", "duster", 5500000);
	Vehicle v3 = new Vehicle(3, "Toyota,", "Yaris", 1100000);
	 

	Transaction tr = session.beginTransaction();
	session.save(v1);
	session.save(v2);
	session.save(v3);
	tr.commit();
	session.close();
	System.out.println("RECORD ADDED");

}
}
