package com.prueba;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import antlr.StringUtils;
import dto.PersonaDto;

@RestController
@RequestMapping("/controlador")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

	@Autowired
	PersonaService Pservice;
	PersonaRepository r;
	@GetMapping("/list") 
	public ResponseEntity<List<Persona>> list(){
		List<Persona> personas = new ArrayList<Persona>();
		personas = Pservice.list();
		return new ResponseEntity(personas, HttpStatus.OK);
	}
	
	@GetMapping(path ="/find/{id}")
	public ResponseEntity<Persona> findById(@PathVariable int id) {
		Persona p = Pservice.findById(id);
		return new ResponseEntity<Persona>(p, HttpStatus.OK);
		
	}
	
	@PostMapping(path ="/save")
	public ResponseEntity<?> savePerson (@RequestBody PersonaDto newPerson) {
		if(org.apache.commons.lang3.StringUtils.isBlank(newPerson.getNombre()))
			return new ResponseEntity("El nombre es obligatorio",HttpStatus.BAD_REQUEST);
		if(org.apache.commons.lang3.StringUtils.isBlank(newPerson.getPrimerApellido()))
			return new ResponseEntity("El primer apellido es obligatorio",HttpStatus.BAD_REQUEST);
		if(org.apache.commons.lang3.StringUtils.isBlank(newPerson.getSegundoApellido()))
			return new ResponseEntity("El segundo apellido es obligatorio",HttpStatus.BAD_REQUEST);
		Persona person = Pservice.savePerson(newPerson);
		return new ResponseEntity(person, HttpStatus.OK);
		
	}
	
	@PutMapping(path ="/upd/{id}")
	public ResponseEntity<?> upd(@PathVariable("id") Long id, @RequestBody PersonaDto updPerson){
	if(org.apache.commons.lang3.StringUtils.isBlank(updPerson.getNombre()))
		return new ResponseEntity("El nombre es obligatorio",HttpStatus.BAD_REQUEST);
	if(org.apache.commons.lang3.StringUtils.isBlank(updPerson.getPrimerApellido()))
		return new ResponseEntity("El primer apellido es obligatorio",HttpStatus.BAD_REQUEST);
	if(org.apache.commons.lang3.StringUtils.isBlank(updPerson.getSegundoApellido()))
		return new ResponseEntity("El segundo apellido es obligatorio",HttpStatus.BAD_REQUEST);
	Persona updperson = Pservice.editPerson(updPerson, id);
	return new ResponseEntity(updperson, HttpStatus.OK);
	
	}
	

}
