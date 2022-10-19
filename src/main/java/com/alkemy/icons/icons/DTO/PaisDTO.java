package com.alkemy.icons.icons.DTO;

import java.util.Set;

import com.alkemy.icons.icons.entity.ContinenteEntity;
import com.alkemy.icons.icons.entity.IconEntity;

public class PaisDTO {
	
	private Long id;
	private String imagen;
	private String denominacion;
	private Long cantidadHabitantes;
	private Long Superficie;
	private ContinenteEntity continente;
	private Long continenteId;
	private Set<IconEntity> icons;
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
	public Long getCantidadHabitantes() {
		return cantidadHabitantes;
	}
	public void setCantidadHabitantes(Long cantidadHabitantes) {
		this.cantidadHabitantes = cantidadHabitantes;
	}
	public Long getSuperficie() {
		return Superficie;
	}
	public void setSuperficie(Long superficie) {
		Superficie = superficie;
	}
	public ContinenteEntity getContinente() {
		return continente;
	}
	public void setContinente(ContinenteEntity continente) {
		this.continente = continente;
	}
	public Long getContinenteId() {
		return continenteId;
	}
	public void setContinenteId(Long continenteId) {
		this.continenteId = continenteId;
	}
	public Set<IconEntity> getIcons() {
		return icons;
	}
	public void setIcons(Set<IconEntity> icons) {
		this.icons = icons;
	}
	
	

}
