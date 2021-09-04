package com.Practica1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="usr_usuarios")

public class UsrUsuario {
	
	@Id
	@Column(name="id_usuario")
	private String idUsuario;
	
	@ManyToOne
	@JoinColumn(name="id_rol")
	private UsrRol usrRol;
	
	
	private String nombre;
	
	private String apellido;
	
	private String clave;
	
	private String estado;
	
	private String telefono;
	
	private String email;
	
	private String direccion;
	
	
	public UsrUsuario() {
		
	}

	
	public UsrUsuario(String idUsuario, String nombre, String apellido, String clave, String estado, String telefono,
			String email, String direccion) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.estado = estado;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}

	

	public UsrRol getUsrRol() {
		return usrRol;
	}


	public void setUsrRol(UsrRol usrRol) {
		this.usrRol = usrRol;
	}


	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	
}
