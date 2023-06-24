package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    
    { 
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Student stud=(Student) context.getBean("stud");
    	Student stud1=(Student)context.getBean("stud1");
        System.out.println("Hello World!");
        System.out.println(stud);
        System.out.print(stud1);
        
    }
}
