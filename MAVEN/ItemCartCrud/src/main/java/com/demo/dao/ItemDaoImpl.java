package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Items;

public class ItemDaoImpl implements ItemDao{
	static SessionFactory sf;
	static {
		sf = HibernateUtil.getMySessionFactory();
	}
	@Override
	public boolean save(Items i) {
		if(i==null) {
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			session.save(i);
			tr.commit();
			return true;
		}else {
			return false;
		}
	}

}
