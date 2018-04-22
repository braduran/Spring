package co.com.anotaciones;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo: 1-Everton 2-Real Madrid");
		int rta= sc.nextInt();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("co/com/anotaciones/Beans.xml");
		
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		
		
		switch (rta) {
		case 1:
			jug.setEquipo(new Everton());
			break;
		case 2:
			jug.setEquipo(new RealMadrid());
			break;
		default:
			break;
		}
		
		System.out.println(jug.getId() + " - " + jug.getNombre() + " - " + jug.getEquipo().mostrar()
				+ " - " + jug.getCamiseta().getNumero() + " - " + 
				jug.getCamiseta().getMarca().getNombre());
		
				
		((ConfigurableApplicationContext)appContext).close();
	}
}
