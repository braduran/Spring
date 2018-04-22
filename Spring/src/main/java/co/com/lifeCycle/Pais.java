package co.com.lifeCycle;

public class Pais {
	
	private String nombre;

	private void initBean() {
		System.out.println("Iniciando bean Pais...");
	}
	
	private void destroyBean() {
		System.out.println("Bean Pais a punto de ser destruido...");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
