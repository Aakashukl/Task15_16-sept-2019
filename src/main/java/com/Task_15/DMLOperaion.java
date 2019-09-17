package com.Task_15;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DMLOperaion {
	static Session session = Util.getSessionFactory().openSession();
	
	public static void updateData(int empno, int salary) {
		
		Transaction tr = session.beginTransaction();
		String hql = "update Emp set empSalary = :sal where empId = :no";
		Query query = session.createQuery(hql);
		query.setParameter("sal", salary);
		query.setParameter("no", empno);
		int n=query.executeUpdate();
		tr.commit();
		System.out.println("working");
	}
	
	public static void deleteData(int num) {
		Transaction tr = session.beginTransaction();
		String hql = "drop table Emp where empId = :del";
		Query query = session.createQuery(hql);
		query.setParameter("del", num);
		int n=query.executeUpdate();
		tr.commit();
		System.out.println("working");

	}
	
	public static void main(String[] args) {
		
		updateData(1,3000);
		deleteData(2);
	}

}
