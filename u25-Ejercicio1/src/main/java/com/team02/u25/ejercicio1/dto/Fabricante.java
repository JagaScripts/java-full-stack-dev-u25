package com.team02.u25.ejercicio1.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "fabricante")
public class Fabricante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo") 
	private int codigo;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Articulo> articulos;
	
	public Fabricante() {
		
	}
	
	public Fabricante(int codigo, String nombre) {
		this.nombre = nombre;
		this.codigo = codigo;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "articulo")
	public List<Articulo> getArticulos() {
		return articulos;
	}


	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}


	@Override
	public String toString() {
		return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
}
