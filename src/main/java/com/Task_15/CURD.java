package com.Task_15;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CURD {

	static Session session = Util.getSessionFactory().openSession();
	public static void updateData(int empno,int salary) 
	{
		Transaction tr = session.beginTransaction();
		String hql = "update Emp set empSalary = :sal where empId = :no";
		Query query = session.createQuery(hql);
		query.setParameter("sal", salary);
		query.setParameter("no", empno);
		query.executeUpdate();
		tr.commit();
		System.out.println("working");
		
	}
	
	public static void deleteData(int id) 
	{
		Transaction tr = session.beginTransaction();
		String hql = "drop table Emp where empId = :del";
		Query query = session.createQuery(hql);
		query.setParameter("del", id);
		int n=query.executeUpdate();
		tr.commit();
		System.out.println("working");
		
	}
	
	public static void searchData(int id) 
	{
		Emp emp =(Emp) session.get(Emp.class, id);
		if(emp!=null) {
			String lap = emp.getLaptop().getLaptopName();
			String vehicle = emp.getVehicle().getBrand() +" "+ emp.getVehicle().getModel();

			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getEmpSalary());
			System.out.println(lap);
			System.out.println(vehicle);
		}
		
	}
	
	public static void main(String[] args) {
		updateData(1,500000);
		deleteData(1);
		searchData(1);

	}

}
