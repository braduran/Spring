package co.com.stereotypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jugadorcito")
public class Jugador {
	
	@Value("10")
	private int numero;
	@Value("Wen Rooney")
	private String nombre;
	@Autowired
	private IEquipo equipo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
}
