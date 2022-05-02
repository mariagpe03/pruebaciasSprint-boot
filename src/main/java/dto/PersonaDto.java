package dto;

import java.time.ZonedDateTime;

import javax.persistence.Column;

public class PersonaDto {
	private int id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String telefono;
	private String estatus;
	private ZonedDateTime fechaIns;
	private ZonedDateTime fechaUpd;
	
	public PersonaDto() {
		super();
	}
	public PersonaDto(int id, String nombre, String primerApellido, String segundoApellido, String telefono,
			String estatus, ZonedDateTime fechaIns, ZonedDateTime fechaUpd) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.telefono = telefono;
		this.estatus = estatus;
		this.fechaIns = fechaIns;
		this.fechaUpd = fechaUpd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public ZonedDateTime getFechaIns() {
		return fechaIns;
	}
	public void setFechaIns(ZonedDateTime fechaIns) {
		this.fechaIns = fechaIns;
	}
	public ZonedDateTime getFechaUpd() {
		return fechaUpd;
	}
	public void setFechaUpd(ZonedDateTime fechaUpd) {
		this.fechaUpd = fechaUpd;
	}	
}
