package co.com.InjectingCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("co/com/InjectingCollection/Beans.xml");
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		jc.getList();
		jc.getSet();
		jc.getMap();
		jc.getProperties();
	}
}
