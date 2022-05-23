package com.team02.u25.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team02.u25.ejercicio1.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Integer>{

}
