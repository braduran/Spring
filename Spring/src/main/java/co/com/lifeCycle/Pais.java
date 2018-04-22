package co.com.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pais implements InitializingBean, DisposableBean{
	
	private String nombre;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Iniciando bean Pais...");		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean Pais a punto de ser destruido...");		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
