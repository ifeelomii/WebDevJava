package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Address;
import com.demo.model.User;

public class BeanWiringTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		Address addr = (Address) ctx.getBean("addr");
//		System.out.println(addr);
		User usr = (User) ctx.getBean("user1");
		System.out.println(usr);
	}

}
