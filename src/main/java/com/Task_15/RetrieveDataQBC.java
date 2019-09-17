package com.Task_15;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class RetrieveDataQBC {

	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Emp.class);
		
		//Order by
		Order o1 = Order.asc("empSalary");
		criteria.addOrder(o1);
		
		//Restrictions
		Restrictions.gt("empSalary", 600);
		
		// Getting data into list
		List<Emp> list = criteria.list(); 
		
		
		System.out.println("Working");
		for(Emp emp:list) {
			
			System.out.println(emp);
		}
	}

}
