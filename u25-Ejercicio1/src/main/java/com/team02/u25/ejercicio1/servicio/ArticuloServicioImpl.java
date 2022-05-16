/**
 * u25-Ejercicio1 - com.team02.u25.ejercicio1.servicio - ArticuloServicioImpl
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 16/05/2022
 */
package com.team02.u25.ejercicio1.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team02.u25.ejercicio1.dto.Articulo;
import com.team02.u25.ejercicio1.dao.IArticuloDAO;

/**
 * ArticuloServicioImpl.java
 *
 */
@Service
public class ArticuloServicioImpl implements IArticuloServicio {

	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(Long id) {
		return iArticuloDAO.findById(id).get();
	}


	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		iArticuloDAO.deleteById(id);

	}

}
