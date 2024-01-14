package com.demo.test;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.demo.model.User;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User(01,"Omkar",50000);
		User user2 = new User(02,"Ashish",48000);
		User user3 = new User(03,"Harsih",49000);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		
		sess.save(user1);
		sess.save(user2);
		sess.save(user3);
		
		tr.commit();
	}

}
