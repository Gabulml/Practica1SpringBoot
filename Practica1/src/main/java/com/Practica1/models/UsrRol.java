package com.Practica1.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import java.util.list;

@Entity
@Table(name="usr_rol")

public class UsrRol {
	

	@Id
	//nombre para llamarlo internmente dentro del java, NOMbre externo de la secuencia de la base de datos, allocationSize = 1 importate incluirla
	@SequenceGenerator(name="USR_ROL_SECUENCIA", sequenceName = "SEQ_USR_ROL", allocationSize = 1)
	//
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="USR_ROL_SECUENCIA")
	@Column(name="id_rol")
	private Long idRol;
	
	private String nombre;
	
	private String estado;
	
	private String observacion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "usrRol")
	private List<UsrUsuario> usrUsuarios;
	
	
	public UsrRol() {
		
	}
	
	
	

	public UsrRol(Long idRol, String nombre, String estado, String observacion) {
		super();
		this.idRol = idRol;
		this.nombre = nombre;
		this.estado = estado;
		this.observacion = observacion;
		
	}




	@Override
	public String toString() {
		return "UsrRol [idRol=" + idRol + ", nombre=" + nombre + ", estado=" + estado + ", observacion=" + observacion
				 + "]";
	}



	public Long getIdRol() {
		return idRol;
	}

	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	
	
	
}
