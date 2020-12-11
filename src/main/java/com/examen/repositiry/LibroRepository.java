package com.examen.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.examen.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{

	@Query("select x from Libro x where x.titulo = :var_filtro")
	public List<Libro> listaPorTitulo(@Param("var_filtro")String filtro);


}
