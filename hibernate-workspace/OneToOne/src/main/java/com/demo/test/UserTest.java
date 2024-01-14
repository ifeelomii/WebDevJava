package com.demo.test;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;

public class UserTest {

	public static void main(String[] args) {
		Address add1 = new Address(101,"Model Colony","Pune");
		Address add2 = new Address(102,"Model Colony","Pune");
		User us1 = new User(1,"Omkar",add1);
		User us2 = new User(2,"Pranav",add2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess =  sf.openSession();
		Transaction tr = sess.beginTransaction();
		sess.save(add1);
		sess.save(add2);
		sess.save(us1);		
		sess.save(us2);
		tr.commit();
	}

}
