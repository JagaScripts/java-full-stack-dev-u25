/**
 * u25-Ejercicio1 - com.team02.u25.ejercicio1.servicio - FabricanteServicioImpl
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

import com.team02.u25.ejercicio1.dto.Fabricante;
import com.team02.u25.ejercicio1.dao.IFabricanteDAO;

/**
 * FabricanteServicioImpl.java
 *
 */
@Service
public class FabricanteServicioImpl implements IFabricanteServicio {

	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	
	@Override
	public List<Fabricante> listarFabricantes() {
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante)
	}

	@Override
	public Fabricante fabricanteXID(Long id) {
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public List<Fabricante> listarFabricanteNomnbre(String nombre) {
		return iFabricanteDAO.findByNombre(nombre);
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		return iFabricanteDAO.deleteById(id);

	}

}
