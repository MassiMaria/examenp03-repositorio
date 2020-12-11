package com.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.Libro;
import com.examen.service.LibroService;

@RestController
@RequestMapping("/api/rest/libro")
public class LibroController {
	
	@Autowired
	private LibroService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Libro>> listaLibro(){
		return ResponseEntity.ok(service.listaLibro());
	}
	
	@GetMapping("/porTitulo/{filtro}")
	public ResponseEntity<List<Libro>> listaPorTitulo(@PathVariable String filtro)
	{
		return ResponseEntity.ok(service.listaLibroPorTitulo(filtro));
	}

}
