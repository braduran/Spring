package co.com.stereotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("co/com/stereotypes/Beans.xml");
		
		Jugador jug = (Jugador) appContext.getBean("jugadorcito");
		System.out.println(jug.getNumero() + " - " + jug.getNombre() + " - " + jug.getEquipo().mostrar());
		
				
		((ConfigurableApplicationContext)appContext).close();
	}
}
