package com.alkemy.icons.icons.service;

import java.util.List;

import com.alkemy.icons.icons.DTO.PaisDTO;

public interface PaisService {
	
	PaisDTO save(PaisDTO dto);
	
	List<PaisDTO> getAllPaises();

}
