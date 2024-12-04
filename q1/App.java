package com.codinghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//    	Parent parent=context.getBean("4",Parent.class);
//    	System.out.println(parent);
//    	College college=context.getBean("5",College.class);
//    	System.out.println(college);
//    	System.out.println(context.getBean("1",Pro1.class));
//    	System.out.println(context.getBean("2",Pro1.class));
//    	System.out.println(context.getBean("3",Pro1.class));
    	
//    	Movie movie=context.getBean("14",Movie.class);
//    	System.out.println(movie);
    	
    	Student11 s11=context.getBean("15",Student11.class);
    	System.out.println(s11);
    	Employee11 e11=context.getBean("16",Employee11.class);
    	System.out.println(e11);
    	
    }
}

