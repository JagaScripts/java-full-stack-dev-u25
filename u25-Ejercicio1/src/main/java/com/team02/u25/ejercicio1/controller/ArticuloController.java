/**
 * u25-Ejercicio1 - com.team02.u25.ejercicio1.controller - ArticuloController
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 23/05/2022
 */
package com.team02.u25.ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team02.u25.ejercicio1.dto.Articulo;

import com.team02.u25.ejercicio1.service.ArticuloServiceImpl;


/**
 * ArticuloController.java
 *
 */
@RestController
@RequestMapping("/articulos")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;

	@GetMapping("/")
	public List<Articulo> listarArticulos() {
		return articuloServiceImpl.listarArticulos();
	}

	@PostMapping("/")
	public Articulo salvarArticulo(@RequestBody Articulo articulo) {

		return articuloServiceImpl.guardarArticulo(articulo);
	}

	@GetMapping("/{codigo}")
	public Articulo articuloXID(@PathVariable(name = "codigo") int codigo) {

		Articulo articulo_xid = new Articulo();

		articulo_xid = articuloServiceImpl.articuloXID(codigo);


		return articulo_xid;
	}

	@PutMapping("/{codigo}")
	public Articulo actualizarArticulo(@PathVariable(name = "codigo") int codigo, @RequestBody Articulo articulo) {

		Articulo articulo_seleccionado = new Articulo();
		Articulo articulo_actualizado = new Articulo();

		articulo_seleccionado = articuloServiceImpl.articuloXID(codigo);

		articulo_seleccionado.setNombre(articulo.getNombre());

		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);


		return articulo_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eleiminarArticulo(@PathVariable(name="codigo")int codigo) {
		articuloServiceImpl.eliminarArticulo(codigo);
	}
}
