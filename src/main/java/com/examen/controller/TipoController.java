package com.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.Tipo;
import com.examen.service.TipoService;

@RestController
@RequestMapping("/api/url/tipolibro")
public class TipoController {
	
	@Autowired //es como darle new
	private TipoService service;
	
	@GetMapping("/")
	public ResponseEntity< List<Tipo>> lista(){
		return ResponseEntity.ok(service.listaTipo());
	}

}
