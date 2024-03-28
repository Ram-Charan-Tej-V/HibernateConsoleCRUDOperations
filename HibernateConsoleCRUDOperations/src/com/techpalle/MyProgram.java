package com.techpalle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techpalle.model.Employee;

public class MyProgram {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
		
		//C - CREATING ROWS IN THE TABLE
		Employee e1 = new Employee(1, "Steve", 10000, "developer");
		Employee e2 = new Employee(2, "bill", 20000, "developer");
		Employee e3 = new Employee(3, "andy", 30000, "hr");
		s.save(e1); //inserts first object as first row
		s.save(e2); //inserts second object as second row
		s.save(e3); //inserts third object as third row
		t.commit(); //now we can run and go to mysql workbench to check employee table
		
		//R - READING ROWS FROM THE TABLE
		Employee x = s.get(Employee.class, 1);
		System.out.println(x.getEno());
		System.out.println(x.getEname());
		System.out.println(x.getEsal());
		System.out.println(x.getEdesignation());
		
		//U - UPDATING ROW FROM THE TABLE - i want to update 2nd employee sal to 40000
		Employee y = s.get(Employee.class, 2);
		y.setEsal(40000);
		s.save(y);
		t.commit();
		
		//D - DELETE ROW FROM THE TABLE - i want to delete 1st Employee
		Employee z = s.get(Employee.class, 1);
		s.delete(z);
		t.commit();
	}

}
