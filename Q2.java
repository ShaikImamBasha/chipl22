package com.coding;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codinghub.Game11;

public class Mainn {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Game11 gm=context.getBean(Game11.class);
		System.out.println(gm);
	}

}
_________________________________________________________________________

package com.coding;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codinghub.Game11;

@Configuration
public class Config 
{
@Bean
public Game11 gm()
{
	Game11 game=new Game11("Cricket","11","chepak","50000");
	return game;
}
}
_____________________________________

package com.codinghub;

public class Game11 {
String name;
String players;
String Stadium_name;
String capacity;
public Game11(String name, String players, String stadium_name, String capacity) {
	super();
	this.name = name;
	this.players = players;
	Stadium_name = stadium_name;
	this.capacity = capacity;
}
@Override
public String toString() {
	return "Game11 [name=" + name + ", players=" + players + ", Stadium_name=" + Stadium_name + ", capacity=" + capacity
			+ "]";
}



}
_______________________________________________________

package com.codinghub;

public class Employee11 {
	int id;
	String name;
	String dept;
	double salary;
	public Employee11(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee11 [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

}
____________________________________________________________
package com.codinghub;

public class Student11 {
	
	String name;
	String section;
	int marks;
	String college;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student11 [name=" + name + ", section=" + section + ", marks=" + marks + ", college=" + college + "]";
	}
	
}
__________________________________________
package com.codinghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	Student11 s11=context.getBean("15",Student11.class);
    	System.out.println(s11);
    	Employee11 e11=context.getBean("16",Employee11.class);
    	System.out.println(e11);
    	Game11 g=context.getBean(Game11.class);
    	System.out.println(g);
    }
}
_______________________________________
<?xml version="1.0" encoding="UTF-8"?> 
<beans xmlns="http://www.springframework.org/schema/beans" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
xmlns:context="http://www.springframework.org/schema/context" 
xmlns:p="http://www.springframework.org/schema/p" 
xmlns:tx="http://www.springframework.org/schema/tx" 
xsi:schemaLocation="http://www.springframework.org/schema/beans 
http://www.springframework.org/schema/beans/spring-beans.xsd 
http://www.springframework.org/schema/context 
http://www.springframework.org/schema/context/spring-context.xsd 
http://www.springframework.org/schema/tx 
http://www.springframework.org/schema/tx/spring-tx.xsd"> 
<bean id="1" class="com.codinghub.Pro1">
	<property name="roll" value="101"></property>
	<property name="name" value="Anusha"></property>
</bean>
<bean id="2" class="com.codinghub.Pro1">
	<property name="roll" value="102"></property>
	<property name="name" value="Basha"></property>
</bean>
<bean id="3" class="com.codinghub.Pro1">
	<property name="roll" value="103"></property>
	<property name="name" value="Chasha"></property>
</bean>
<bean id="4" class="com.codinghub.Parent">
<property name="pid" value="11"></property>
<property name="plocation" value="hyd"></property>
<property name="pro1" ref="2"></property>
</bean>
<bean id="5" class="com.codinghub.College">
<constructor-arg index="0" value="122"/>
<constructor-arg index="1" value="SBG"/>
<constructor-arg index="2" ref="4"/>
</bean>



<bean id="6" class="com.codinghub.Audience">
<property name="aname" value="imam"></property>
<property name="amobile" value="6304330548"></property>
</bean>
<bean id="7" class="com.codinghub.Audience">
<property name="aname" value="basha"></property>
<property name="amobile" value="9533974446"></property>
</bean>

<bean id="8" class="com.codinghub.Gener">
<property name="mgener" value="Actoin Drama"></property>
<property name="mbudget" value="300cr"></property>
</bean>
<bean id="9" class="com.codinghub.Gener">
<property name="mgener" value="High voltage Action Drama"></property>
<property name="mbudget" value="350cr"></property>
</bean>

<bean id="10" class="com.codinghub.Review">
<constructor-arg index="0" value="4"/>
<constructor-arg index="1" value="good"/>
<constructor-arg index="2" value="average"/>
</bean>
<bean id="11" class="com.codinghub.Review">
<constructor-arg index="0" value="3"/>
<constructor-arg index="1" value="good"/>
<constructor-arg index="2" value="good"/>
</bean>
<bean id="12" class="com.codinghub.Review">
<constructor-arg index="0" value="4"/>
<constructor-arg index="1" value="Peeks"/>
<constructor-arg index="2" value="good"/>
</bean>

<bean id="13" class="com.codinghub.Movie">
<property name="name" value="pushpa"></property>
<property name="director" value="sukumar"></property>
<property name="actors">
        <list>
            <value>Allu Arjun</value>
            <value>Rashmika Mandanna</value>
            <value>Fahadh Faasil</value>
        </list>
    </property>
<property name="Audience" ref="6"></property>
<property name="Gener" ref="8"></property>
<property name="Review" ref="10"></property>
</bean>

<bean id="14" class="com.codinghub.Movie">
<property name="name" value="Devara"></property>
<property name="director" value="sivakoratala"></property>
<property name="actors">
        <list>
            <value>NTR</value>
            <value>JhanviKapoor</value>
            <value>SaifAliKhan</value>
        </list>
    </property>
<property name="Audience" ref="7"></property>
<property name="Gener" ref="9"></property>
<property name="Review" ref="12"></property>
</bean>


<bean id="15" class="com.codinghub.Student11">
<property name="name" value="devara"></property>
<property name="section" value="A"></property>
<property name="marks" value="90"></property>
<property name="college" value="KLU"></property>
</bean>

<bean id="16" class="com.codinghub.Employee11">
<constructor-arg index="0" value="101"></constructor-arg>
<constructor-arg index="1" value="vara"></constructor-arg>
<constructor-arg index="2" value="IT"></constructor-arg>
<constructor-arg index="3" value="200000"></constructor-arg>
</bean>
 </beans>


