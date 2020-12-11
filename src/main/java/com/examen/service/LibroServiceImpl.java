package com.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Libro;
import com.examen.repositiry.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroRepository repository;
	
	@Override
	public List<Libro> listaLibro() {
		return repository.findAll();
	}

	@Override
	public List<Libro> listaLibroPorTitulo(String titulo) {
	return repository.listaPorTitulo(titulo);
	}

}
