package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class GetTest {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e1 = session.get(Employee.class, 1);
		Project p1 = session.get(Project.class, 1);
		System.out.println(e1);
		System.out.println(p1);
		tr.commit();
		sf.close();
	}
}
