package co.com.InheritanceSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("co/com/InheritanceSpring/Beans.xml");
		HelloIndia obj = (HelloIndia) context.getBean("helloIndia");
		obj.getMessage1();
		obj.getMessage2();
		obj.getMessage3();
	}	
}
