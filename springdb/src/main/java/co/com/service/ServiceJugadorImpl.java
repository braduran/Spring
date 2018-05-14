package co.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.beans.Jugador;
import co.com.dao.DAOJugador;

@Service
public class ServiceJugadorImpl implements ServiceJugador{

	@Autowired
	private DAOJugador daoJugador;
	
	@Override
	public void registrar(Jugador jugador) throws Exception {
		try {
			daoJugador.registrar(jugador);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
