package com.alkemy.icons.icons.service;

import java.util.List;

import com.alkemy.icons.icons.DTO.ContinenteDTO;

public interface ContinenteService {
	
	ContinenteDTO save(ContinenteDTO dto);
	
	List<ContinenteDTO> getAllContinentes();

}
