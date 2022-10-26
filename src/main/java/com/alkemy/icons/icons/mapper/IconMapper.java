package com.alkemy.icons.icons.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alkemy.icons.icons.DTO.IconDTO;
import com.alkemy.icons.icons.DTO.PaisDTO;
import com.alkemy.icons.icons.entity.IconEntity;

@Component
public class IconMapper {
	
	@Autowired
	private PaisMapper paisMapper;
	
	public IconEntity iconDTO2Entity(IconDTO dto){
		IconEntity iconEntity = new IconEntity();
		iconEntity.setImagen(dto.getImagen());
		iconEntity.setDenominacion(dto.getDenominacion());
		iconEntity.setFechaCreacion(dto.getFechaCreacion());
		iconEntity.setAltura(dto.getAltura());
		iconEntity.setHistoria(dto.getHistoria());
		iconEntity.setPaises(dto.getPaises());
		return iconEntity;
	}
	
	public IconDTO iconEntity2DTO(IconEntity entity, boolean loadPaises) {
		IconDTO dto = new IconDTO();
		dto.setId(entity.getId());
		dto.setImagen(entity.getImagen());
		dto.setDenominacion(entity.getDenominacion());
		dto.setFechaCreacion(entity.getFechaCreacion());
		dto.setAltura(entity.getAltura());
		dto.setHistoria(entity.getHistoria());
		dto.setPaises(entity.getPaises());
		if(loadPaises) {
			List<PaisDTO> paisesDTO = this.paisMapper.paisEntityList2DTOList(entity.getPaises(), loadIcons false);
			dto.setPaises(paisesDTO);
		}
		return dto;
	}
	
	public List<IconDTO> iconEntityList2DTOList (List<IconEntity> entities){
		List<IconDTO> dtos = new ArrayList <>();
		for (IconEntity entity : entities) {
			dtos.add(this.iconEntity2DTO(entity));
		}	
		return dtos;	
	}
	
}

