package com.alkemy.icons.icons.service;

import java.util.List;

import com.alkemy.icons.icons.DTO.IconDTO;

public interface IconService {
	
	IconDTO saved (IconDTO dto);
	
	List<IconDTO> getAllIcons();
	
	void delete (Long id);

}
