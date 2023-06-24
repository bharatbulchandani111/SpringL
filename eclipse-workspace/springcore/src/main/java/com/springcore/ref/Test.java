package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		B  temp= (B)context.getBean("bref");
		System.out.println(temp.getId());
		System.out.println(temp.getOb().getName());
		System.out.println(temp.getOb().getNumber());
		
	}

}
