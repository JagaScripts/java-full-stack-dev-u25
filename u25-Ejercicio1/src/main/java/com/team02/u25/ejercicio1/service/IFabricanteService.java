/**
 * u25-Ejercicio1 - com.team02.u25.ejercicio1.servicio - IFabricanteServicio
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 16/05/2022
 */
package com.team02.u25.ejercicio1.service;

import java.util.List;

import com.team02.u25.ejercicio1.dto.Articulo;
import com.team02.u25.ejercicio1.dto.Fabricante;

/**
 * IFabricanteServicio.java
 *
 */
public interface IFabricanteService {

			//Metodos del CRUD
			public List<Fabricante> listarFabricantes(); //Listar All 
			
			public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un fabricante CREATE
			
			public Fabricante fabricanteXID(Long id); //Leer datos de un fabricante READ
			
			public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del fabricante UPDATE
			
			public void eliminarFabricante(Long id);// Elimina el fabricante DELETE
	
}
