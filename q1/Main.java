package com.coding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codinghub.Game11;

public class Mainn {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
//		Employee employee=context.getBean(Employee.class);
//		System.out.println(employee);
//		Student student=context.getBean(Student.class);
//		System.out.println(student);
//		University university=context.getBean(University.class);
//		System.out.println(university);
		Game11 gm=context.getBean(Game11.class);
		System.out.println(gm);
	}

}
