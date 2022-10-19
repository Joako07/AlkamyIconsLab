package com.alkemy.icons.icons.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.alkemy.icons.icons.DTO.PaisDTO;
import com.alkemy.icons.icons.entity.PaisEntity;
import com.alkemy.icons.icons.mapper.PaisMapper;
import com.alkemy.icons.icons.repository.PaisRepository;
import com.alkemy.icons.icons.service.PaisService;

@Service
public class PaisServiceImp implements PaisService{

	@Autowired 
	private PaisMapper paisMapper;
	@Autowired
	private PaisRepository paisRepository;
	
	public PaisDTO save(PaisDTO dto) {
		PaisEntity entity = paisMapper.PaisDTO2Entity(dto);
		PaisEntity entitySaved = paisRepository.save(entity);
		PaisDTO result = paisMapper.paisEntity2DTO(entitySaved);
		return result;
	}
	
	public List<PaisDTO> getAllPaises(){
		List<PaisEntity> entities = paisRepository.findAll();
		List<PaisDTO> result = paisMapper.paisEntityList2DTOList(entities);
		return result;
	}
}
