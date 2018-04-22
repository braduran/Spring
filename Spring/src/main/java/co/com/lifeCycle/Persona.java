package co.com.lifeCycle;

public class Persona {
	
	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	
	private void initBean() {
		System.out.println("Iniciando bean Persona...");
	}
	
	private void destroyBean() {
		System.out.println("Bean Persona a punto de ser destruido...");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
