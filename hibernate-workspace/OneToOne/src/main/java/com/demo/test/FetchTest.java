package com.demo.test;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.demo.model.User;

public class FetchTest {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess =  sf.openSession();
		Transaction tr = sess.beginTransaction();
		User us = sess.get(User.class,2);
		System.out.println(us.getId());
		System.out.println(us.getName());
		System.out.println(us.getAddr());
		tr.commit();
	}
}
