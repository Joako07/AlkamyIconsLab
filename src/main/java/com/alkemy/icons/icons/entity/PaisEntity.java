package com.alkemy.icons.icons.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name= "pais")
@Getter 
@Setter
public class PaisEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String imagen;
	
	private String denominacion;
	
	@Column(name = "cant_habitantes")
	private Long cantidadHabitantes;
	
	private Long Superficie;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
	@JoinColumn(name = "continente_id", insertable = false, updatable = false)
	private ContinenteEntity continente;
	
	@Column(name = " continente_id", nullable = false)
	private Long continenteId;
	
	@ManyToMany(
			cascade= {
			CascadeType.PERSIST,
			CascadeType.MERGE
			})
	@JoinTable(
			name = "icon_pais",
			joinColumns= @JoinColumn(name = "pais_id"),
			inverseJoinColumns= @JoinColumn(name= "icon_id"))
			private Set<IconEntity> icons = new HashSet<>();

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
