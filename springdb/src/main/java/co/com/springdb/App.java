package co.com.springdb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.beans.Camiseta;
import co.com.beans.Equipo;
import co.com.beans.Jugador;
import co.com.beans.Marca;
import co.com.service.ServiceJugador;
import co.com.service.ServiceMarca;

public class App {
	
	public static void main(String[] args) {
		//insertMarca(3, "PUMA");
		insertJugador(3,"Zlatan Ibrahimovic");
	}
	
	public static void insertMarca(int id, String marca) {
		Marca mar = new Marca();
		mar.setId(id);
		mar.setNombre(marca);
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("co/com/resources/Beans.xml");
		ServiceMarca sm = (ServiceMarca) appContext.getBean("serviceMarcaImpl");
		
		try {
			sm.registrar(mar);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insertJugador(int id, String nombre) {
		Jugador jug = new Jugador();
		jug.setId(id);
		jug.setNombre(nombre);
		
		Equipo equ = new Equipo();
		equ.setId(2);
		
		jug.setEquipo(equ);
		
		Camiseta cam = new Camiseta();
		cam.setId(1);
		
		Marca mar = new Marca();
		mar.setId(2);
		cam.setMarca(mar);
		
		jug.setCamiseta(cam);
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("co/com/resources/Beans.xml");
		ServiceJugador sj = (ServiceJugador) appContext.getBean("serviceJugadorImpl");
		try {
			sj.registrar(jug);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
