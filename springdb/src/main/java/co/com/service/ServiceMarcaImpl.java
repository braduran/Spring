package co.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.beans.Marca;
import co.com.dao.DAOMarca;

@Service
public class ServiceMarcaImpl implements ServiceMarca{

	@Autowired
	private DAOMarca daoMarca;
	
	@Override
	public void registrar(Marca marca) throws Exception {
		try {
			daoMarca.registrar(marca);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
