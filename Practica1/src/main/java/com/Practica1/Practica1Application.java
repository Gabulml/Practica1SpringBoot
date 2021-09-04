package com.Practica1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Practica1.models.UsrRol;
import com.Practica1.services.UsrRolService;

@SpringBootApplication
public class Practica1Application implements CommandLineRunner {
//public class Practica1Application {
	
	
	@Autowired
	private UsrRolService usrRolService; 

	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);
	}
	
	public void run(String... args) throws Exception{
	
	//  usrRolService.ingresarNuevoRol(new UsrRol( new Long(3), "Pepi", "A", "sOY DN PEPI"));
	//	usrRolService.eliminarRol(new UsrRol( new Long(3), "Pepi", "A", "sOY DN PEPI"));
		//usrRolService.actualizarRol(new UsrRol( new Long(3), "Pepi", "A", "sOY DN PEPI podeoros jaja"));
		usrRolService.obtenerTodosRol().forEach(rol->{
		//trae solo el id de la BD   ->  Rol existente-> 1
		//System.out.println("Rol existente-> " + rol.getIdRol());
		
		//con este obtenemos toda la inf..  ->  Rol existente-> UsrRol [idRol=1, nombre=Administrador, estado=A, observacion=Administrador]
		System.out.println("Rol existente-> " + rol);
	});
		
		
	}
	
	// con esta sentencia en el archivo application.properties podemos obtener la sentencia jpql que realiza para obtener los datos, dando como resultado la siguinete linea
	//Hibernate: select usrrol0_.id_rol as id_rol1_0_, usrrol0_.estado as estado2_0_, usrrol0_.nombre as nombre3_0_, usrrol0_.observacion as observac4_0_ from usr_rol usrrol0_
	
	
	//server.port=8581  -> si queremos cambiar de puerto en el archivo applications.properties

}
