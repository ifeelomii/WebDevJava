package com.demo.test;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;

public class Test {

	public static void main(String[] args) {
		Address add1 = new Address(1,"Ganesh Nagar","Beed");
		Address add2 = new Address(2,"Gokhale Nagar","Pune");
		
		User us1 = new User(10,"Omkar");
		User us2 = new User(11,"Pranav");
		add1.setUser(us1);
		add2.setUser(us2);
		us1.setAddr(add1);
		us2.setAddr(add2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		
		sess.save(add1);
		sess.save(add2);
		sess.save(us1);
		sess.save(us2);
		tr.commit();
	}

}
