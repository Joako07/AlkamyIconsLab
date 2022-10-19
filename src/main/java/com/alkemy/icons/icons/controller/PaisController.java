package com.alkemy.icons.icons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alkemy.icons.icons.DTO.PaisDTO;
import com.alkemy.icons.icons.service.PaisService;

@RestController
@RequestMapping("pais")
public class PaisController {
	
	@Autowired
	private PaisService paisService;
	
	@GetMapping
	public ResponseEntity<List<PaisDTO>> getAll(){
		List<PaisDTO> paises = paisService.getAllPaises();
		return ResponseEntity.ok().body(paises);
	}
	
	@PostMapping
	public ResponseEntity<PaisDTO> save(@RequestBody PaisDTO pais){
		PaisDTO paisGuardado = paisService.save(pais);
		return ResponseEntity.status(HttpStatus.CREATED).body(paisGuardado);
	}
}
