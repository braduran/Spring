package co.com.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class RealMadrid implements IEquipo{

	@Override
	public String mostrar() {
		return "Real Madrid FC";
	}

}
