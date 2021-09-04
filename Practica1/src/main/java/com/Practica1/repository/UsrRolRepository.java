package com.Practica1.repository;

import org.springframework.data.repository.CrudRepository;

import com.Practica1.models.UsrRol;

//para herencia - 1ro a quien pertence y 2do que tipo de dato es la clave primaria
public interface UsrRolRepository extends CrudRepository<UsrRol, Long>{
	

}
