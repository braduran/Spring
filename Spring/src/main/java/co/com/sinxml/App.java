package co.com.sinxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Jugador jug = (Jugador) ac.getBean("jugador1");
		
		System.out.println(jug.getId() + " - " + jug.getNombre() + " - " + jug.getEquipo().mostrar()
				+ " - " + jug.getCamiseta().getNumero());
		
		((ConfigurableApplicationContext)ac).close();
	}

}
