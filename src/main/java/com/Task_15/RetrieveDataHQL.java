package com.Task_15;

import java.util.List;

import org.hibernate.Session;

public class RetrieveDataHQL {

	public static void main(String[] args) {
		Session session = Util.getSessionFactory().openSession();

		String hql = "from Emp where EmpSalary > 250 order by empSalary desc";

		List<Emp> list = session.createQuery(hql).list();

		for (Emp emp : list) {
			System.out.println(emp);
		}
	}

}
