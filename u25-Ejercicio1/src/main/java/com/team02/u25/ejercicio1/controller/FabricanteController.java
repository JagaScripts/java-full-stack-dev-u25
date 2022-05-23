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

import com.team02.u25.ejercicio1.dto.Fabricante;
import com.team02.u25.ejercicio1.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/fabricante")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;

	@GetMapping("/")
	public List<Fabricante> listarFabricantes() {
		return fabricanteServiceImpl.listarFabricantes();
	}

	@PostMapping("/")
	public Fabricante salvarFabricante(@RequestBody Fabricante fabricante) {

		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}

	@GetMapping("/{codigo}")
	public Fabricante fabricanteXID(@PathVariable(name = "codigo") int codigo) {

		Fabricante fabricante_xid = new Fabricante();

		fabricante_xid = fabricanteServiceImpl.fabricanteXID(codigo);


		return fabricante_xid;
	}

	@PutMapping("/{codigo}")
	public Fabricante actualizarFabricante(@PathVariable(name = "codigo") int codigo, @RequestBody Fabricante fabricante) {

		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();

		fabricante_seleccionado = fabricanteServiceImpl.fabricanteXID(codigo);

		fabricante_seleccionado.setNombre(fabricante.getNombre());

		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);


		return fabricante_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eleiminarFabricante(@PathVariable(name="codigo")int codigo) {
		fabricanteServiceImpl.eliminarFabricante(codigo);
	}

}
