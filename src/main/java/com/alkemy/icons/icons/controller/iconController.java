package com.alkemy.icons.icons.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.alkemy.icons.icons.DTO.IconDTO;
import com.alkemy.icons.icons.service.IconService;

@RestController
@RequestMapping("icons")
public class iconController {
	
	@Autowired
	private IconService iconService;
	
	@GetMapping
	public ResponseEntity<List<IconDTO>> getAll(){
		List<IconDTO> icons = iconService.getAllIcons();
		return ResponseEntity.ok().body(icons);
	}
	
	@PostMapping
	public ResponseEntity<IconDTO> save(@RequestBody IconDTO icon){
		IconDTO iconGuardado = iconService.saved(icon);
		return ResponseEntity.status(HttpStatus.CREATED).body(iconGuardado);
	}
	
	@DeleteMapping("/{id}")
		public ResponseEntity<Void>delete(@PathVariable Long id){
			this.iconService.delete(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	
}
