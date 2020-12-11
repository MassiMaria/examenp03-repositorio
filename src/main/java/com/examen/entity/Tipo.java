package com.examen.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipolibro")
@Getter
@Setter
public class Tipo {
	
	@Id
	private int idTipoLibro;
	private String nombre;
	private String estado;
	
	
	public int getIdTipoLibro() {
		return idTipoLibro;
	}
	public void setIdTipoLibro(int idTipoLibro) {
		this.idTipoLibro = idTipoLibro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
