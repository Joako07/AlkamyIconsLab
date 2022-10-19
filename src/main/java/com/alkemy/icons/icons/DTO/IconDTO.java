package com.alkemy.icons.icons.DTO;

import java.time.LocalDate;
import java.util.List;

import com.alkemy.icons.icons.entity.PaisEntity;

public class IconDTO {

	private Long id;
	private String imagen;
	private String denominacion;
	private LocalDate fechaCreacion;
	private Long altura;
	private String historia;
	private List<PaisEntity> paises;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Long getAltura() {
		return altura;
	}
	public void setAltura(Long altura) {
		this.altura = altura;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public List<PaisEntity> getPaises() {
		return paises;
	}
	public void setPaises(List<PaisEntity> paises) {
		this.paises = paises;
	}
	
	
}
