/**
 * u25-Ejercicio1 - com.team02.u25.ejercicio1.servicio - ArticuloServicioImpl
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 16/05/2022
 */
package com.team02.u25.ejercicio1.service;

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
public class ArticuloServiceImpl implements IArticuloService {

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
	public Articulo articuloXID(int codigo) {
		return iArticuloDAO.findById(codigo).get();
	}


	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(int codigo) {
		iArticuloDAO.deleteById(codigo);

	}

}
