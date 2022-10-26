package com.alkemy.icons.icons.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.icons.icons.DTO.IconDTO;
import com.alkemy.icons.icons.entity.IconEntity;
import com.alkemy.icons.icons.mapper.IconMapper;
import com.alkemy.icons.icons.repository.IconRepository;
import com.alkemy.icons.icons.service.IconService;

@Service
public class IconServiceImp implements IconService{
	
	@Autowired
	private IconMapper iconMapper;
	@Autowired
	private IconRepository iconRepository;
	
	public IconDTO saved(IconDTO dto) {
		IconEntity entity = iconMapper.iconDTO2Entity(dto);
		IconEntity entitySaved = iconRepository.save(entity);
		IconDTO result = iconMapper.iconEntity2DTO(entitySaved);
		return result;
	}

	public List<IconDTO> getAllIcons() {
		List<IconEntity> entities = iconRepository.findAll();
		List<IconDTO> result = iconMapper.iconEntityList2DTOList(entities);
		return result;
	}

	public void delete(Long id) {
		this.iconRepository.deleteById(id);
	}

}
