package com.demo.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.demo.model.User;

public class TestSpring {

	public static void main(String[] args) {
		// BeanFactory bfc = new XmlBeanFactory(new ClassPathResource
		// ("springconfig.xml"));
		// User u1 = (User) bfc.getBean("u1");
		// System.out.println(u1);

		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		User u0 = (User) ctx.getBean("u0"); System.out.println(u0);
		
		User u1 = (User) ctx.getBean("u1"); System.out.println(u1);
		
		User u2 = (User) ctx.getBean("u2"); System.out.println(u2);
		 


	}
}
