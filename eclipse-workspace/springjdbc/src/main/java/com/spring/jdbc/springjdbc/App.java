package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
        JdbcTemplate templ=context.getBean("jdbcTemplate",JdbcTemplate.class);
        String q="insert into student(id,name,city) values(?,?,?)";
        int r=templ.update(q,456,"bb","lucknow");
        System.out.print(r);
        
    }
}
