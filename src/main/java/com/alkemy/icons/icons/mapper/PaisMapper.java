package com.alkemy.icons.icons.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alkemy.icons.icons.DTO.PaisDTO;
import com.alkemy.icons.icons.entity.PaisEntity;


@Component
public class PaisMapper {
	
	public PaisEntity PaisDTO2Entity(PaisDTO dto) {
		PaisEntity paisEntity = new PaisEntity();
		paisEntity.setImagen(dto.getImagen());
		paisEntity.setDenominacion(dto.getDenominacion());
		paisEntity.setSuperficie(dto.getSuperficie());
		paisEntity.setCantidadHabitantes(dto.getCantidadHabitantes());
		paisEntity.setContinente(dto.getContinente());
		paisEntity.setContinenteId(dto.getContinenteId());
		return paisEntity;
	}
	
	
	public PaisDTO paisEntity2DTO(PaisEntity entity) {
		PaisDTO dto = new PaisDTO();
		dto.setId(entity.getId());
		dto.setImagen(entity.getImagen());
		dto.setDenominacion(entity.getDenominacion());
		dto.setSuperficie(entity.getSuperficie());
		dto.setCantidadHabitantes(entity.getCantidadHabitantes());
		dto.setContinente(entity.getContinente());
		dto.setContinenteId(entity.getContinenteId());
		return dto;
	}
	
	public List<PaisDTO> paisEntityList2DTOList (List<PaisEntity> entities){
		List<PaisDTO> dtos = new ArrayList<>();
		for(PaisEntity entity : entities) {
			dtos.add(this.paisEntity2DTO(entity));
		}
		return dtos;
	}
}
