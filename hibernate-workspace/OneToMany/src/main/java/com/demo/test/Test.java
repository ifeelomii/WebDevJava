package com.demo.test;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;

public class Test {

	public static void main(String[] args) {
		
		
		User us1 = new User(11,"Omkar");
		User us2 = new User(12,"Chinmay");
		User us3 = new User(13,"Abhishek");
		User us4 = new User(14,"Nilesh");
		
		List<User> lst1 = new ArrayList<>();
		lst1.add(us1);
		lst1.add(us2);
		
		List<User> lst2 = new ArrayList<>();
		lst2.add(us3);
		lst2.add(us4);
		
		Address add1 = new Address(1,"Model Colonu","Pune",lst1);
		Address add2 = new Address(2,"Gokhale Nagar","Pune",lst2);
		
		us1.setAddr(add1);
		us2.setAddr(add1);
		us3.setAddr(add2);
		us4.setAddr(add2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		
		sess.save(add1);
		sess.save(add2);
		sess.save(us1);
		sess.save(us2);
		sess.save(us3);
		sess.save(us4);
		tr.commit();
	}

}
