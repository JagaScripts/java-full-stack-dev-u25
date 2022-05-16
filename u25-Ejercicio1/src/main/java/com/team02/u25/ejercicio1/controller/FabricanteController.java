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

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabrianteServiceImpl fabrianteServiceImpl;

	@GetMapping("/fabricante")
	public List<Fabricante> listarFabricantes() {
		return fabrianteServiceImpl.listarClientes();
	}

	@PostMapping("/fabricante")
	public Fabricante salvarFabricante(@RequestBody Fabricante fabricante) {

		return fabrianteServiceImpl.guardarFabricante(fabricante);
	}

	@GetMapping("/fabricante/{id}")
	public Fabricante fabricanteXID(@PathVariable(name = "id") Long id) {

		Fabricante fabricante_xid = new Fabricante();

		fabricante_xid = fabricanteServiceImpl.clienteXID(id);

		System.out.println("Fabricande id: " + fabricante_xid);

		return fabricante_xid;
	}

	@PutMapping("/fabricante/{id}")
	public Fabricante actualizarFabricante(@PathVariable(name = "id") Long id, @RequestBody Fabricante fabricante) {

		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();

		fabricante_seleccionado = fabrianteServiceImpl.clienteXID(id);

		fabricante_seleccionado.setNombre(fabricante.getNombre());

		fabricante_actualizado = fabrianteServiceImpl.actualizarCliente(fabricante_seleccionado);

		System.out.println("El fabricante actualizado es: " + fabricante_seleccionado);

		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricante/{id}")
	public void eleiminarFabricante(@PathVariable(name="id")Long id) {
		fabrianteServiceImpl.eliminarFabricante(id);
	}

}
