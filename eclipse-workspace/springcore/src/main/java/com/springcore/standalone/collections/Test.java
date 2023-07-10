package com.springcore.standalone.collections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person emp=context.getBean("channels",Person.class);
		System.out.print(emp.getChannels());
	}

}
