package co.com.BeanPostProcessors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("co/com/BeanPostProcessors/Beans.xml");
		HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
		hw.getMessage();
		context.registerShutdownHook();
	}
}
