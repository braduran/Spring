package co.com.sinxml;

import org.springframework.stereotype.Component;

/*
 * @Component, @Repository, @Controller, @Service -> Son lo mismo
 * La diferencia es donde lo uso, en MVC en el controlador puedo usar @Controller,
 * para @Service puedo usarla en servicios rest...*/


@Component
public class Everton implements IEquipo{

	@Override
	public String mostrar() {
		return "Everton FC";
	}

}
