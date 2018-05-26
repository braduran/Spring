package co.com.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("co/com/DependencyInjection/Beans.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}
}
