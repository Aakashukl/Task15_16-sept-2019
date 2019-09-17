package com.Task_15;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionQBC {

	public static void main(String[] args) {
		
		Session session = Util.getSessionFactory().openSession();
		
		Criteria criteria = session.createCriteria(Emp.class);
		ProjectionList proList = Projections.projectionList();
		Projection p1 = Projections.property("empName");
		Projection p2 = Projections.property("empSalary");
		
		// Add Data into Projection list
		proList.add(p1);
		proList.add(p2);
		
		// That projection list data set into criteria
		criteria.setProjection(proList);
		
		// Add data Into proArr
		List<Object[]> proArr = criteria.list();
		
		proArr.forEach((check)-> {
			System.out.println(check[0]+ " "+check[1]);
		});
		
		

	}

}
