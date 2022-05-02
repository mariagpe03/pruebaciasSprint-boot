package com.prueba;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.internal.util.ZonedDateTimeComparator;
import org.hibernate.type.ZonedDateTimeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.PersonaDto;


@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository  Prepositorio;
	
	public List<Persona> list(){
		return (List<Persona>) Prepositorio.findAll();	
	}
	
	public Persona findById(int id) {
		return Prepositorio.findById(id);
	}
	
	public Persona savePerson(PersonaDto personaDto) {
		//Creamos el nuevo registro de la persona
		Persona nuevaPerson= new Persona();
		nuevaPerson.setNombre(personaDto.getNombre());
		nuevaPerson.setPrimerApellido(personaDto.getPrimerApellido());
		nuevaPerson.setSegundoApellido(personaDto.getSegundoApellido());
		nuevaPerson.setTelefono(personaDto.getTelefono());
		nuevaPerson.setEstatus(personaDto.getEstatus());
		Prepositorio.save(nuevaPerson);
		return nuevaPerson;
	}
	
	public Persona editPerson(PersonaDto editDto, Long id) {
		//Creamos el nuevo registro de la persona
		Persona updPerson = Prepositorio.findById(id.intValue());
		updPerson.setNombre(editDto.getNombre());
		updPerson.setPrimerApellido(editDto.getPrimerApellido());
		updPerson.setSegundoApellido(editDto.getSegundoApellido());
		updPerson.setTelefono(editDto.getTelefono());
		updPerson.setEstatus(editDto.getEstatus());
		Prepositorio.save(updPerson);
		return updPerson;
	}
}


