package co.com.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("co/com/lifeCycle/Beans.xml");
		
		Persona per = (Persona) appContext.getBean("persona");
		System.out.println(per.getApodo());
		
		Pais pais = (Pais) appContext.getBean("pais");
		System.out.println(pais.getNombre());
				
		((ConfigurableApplicationContext)appContext).close();
	}
}
