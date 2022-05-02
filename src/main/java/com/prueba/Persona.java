package com.prueba;

import java.time.ZonedDateTime;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@Column(name = "primer_apellido")
	private String primerApellido;
	@Column(name = "segundo_apellido")
	private String segundoApellido;
	private String telefono;
	private String estatus;
	@Column(name = "fecha_ins")
	private ZonedDateTime fechaIns;
	@Column(name = "fecha_upd")
	private ZonedDateTime fechaUpd;
	
	
	public Persona() {
		super();
	}
	public Persona(Long id, String nombre, String primerApellido, String segundoApellido, String telefono,
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", telefono=" + telefono + ", estatus=" + estatus + ", fechaIns=" + fechaIns
				+ ", fechaUpd=" + fechaUpd + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estatus == null) ? 0 : estatus.hashCode());
		result = prime * result + ((fechaIns == null) ? 0 : fechaIns.hashCode());
		result = prime * result + ((fechaUpd == null) ? 0 : fechaUpd.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((primerApellido == null) ? 0 : primerApellido.hashCode());
		result = prime * result + ((segundoApellido == null) ? 0 : segundoApellido.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (estatus == null) {
			if (other.estatus != null)
				return false;
		} else if (!estatus.equals(other.estatus))
			return false;
		if (fechaIns == null) {
			if (other.fechaIns != null)
				return false;
		} else if (!fechaIns.equals(other.fechaIns))
			return false;
		if (fechaUpd == null) {
			if (other.fechaUpd != null)
				return false;
		} else if (!fechaUpd.equals(other.fechaUpd))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (primerApellido == null) {
			if (other.primerApellido != null)
				return false;
		} else if (!primerApellido.equals(other.primerApellido))
			return false;
		if (segundoApellido == null) {
			if (other.segundoApellido != null)
				return false;
		} else if (!segundoApellido.equals(other.segundoApellido))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}	

}
