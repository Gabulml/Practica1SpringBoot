package com.Practica1.controllers;

import java.util.List;import org.hibernate.event.internal.DefaultPersistOnFlushEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Practica1.models.UsrRol;
import com.Practica1.services.UsrRolService;


@RestController
//con    /rol accede a los servicios
@RequestMapping("/rol")
public class UsrRolController {
	
	private static final Logger logger = LoggerFactory.getLogger(UsrRolController.class);
	
	private UsrRolService usrRolService;

	public UsrRolController(UsrRolService usrRolService) {
		super();
		this.usrRolService = usrRolService;
	}
	
	
	//public List<UsrRol> obtenerRoles(){
		//return (List<UsrRol>)usrRolService.obtenerTodosRol();
	//}
	@GetMapping(produces = "application/json")
	public List<UsrRol> obtenerRoles() throws Exception{
		try {
		/*	List<UsrRol> lstRol = usrRolService.obtenerTodosRol();
			System.out.println(lstRol.size());
			return lstRol; */
			return usrRolService.obtenerTodosRol();
		//return (List<UsrRol>)usrRolService.obtenerTodosRol();
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Error en el consumo del servicio obtener Rol. " +e.getMessage());
			throw new Exception(e.getMessage());
		}
	}
	
	//metodo crear
	@PostMapping(produces = "application/json")
	public UsrRol guardarRol(@RequestBody @Validated UsrRol objUsrRol) throws Exception {
		try {
			/*	List<UsrRol> lstRol = usrRolService.obtenerTodosRol();
				System.out.println(lstRol.size());
				return lstRol; */
				return usrRolService.ingresarNuevoRol(objUsrRol);
			//return (List<UsrRol>)usrRolService.obtenerTodosRol();
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Error en el consumo del servicio guardar Rol. " +e.getMessage());
				throw new Exception(e.getMessage());
			}
		
	}
	
	//actualizar
	@PutMapping(produces = "application/json")
	public UsrRol actualizarRol(@RequestBody @Validated UsrRol objUsrRol) throws Exception {
		try {
				return usrRolService.actualizarRol(objUsrRol);
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Error en el consumo del servicio actualizar Rol. " +e.getMessage());
				throw new Exception(e.getMessage());
			}
		
	}
	
	//eliminar
	@RequestMapping(method  = RequestMethod.DELETE)
	public boolean eliminarRol(@RequestBody @Validated UsrRol objUsrRol) throws Exception {
		try {
				 usrRolService.eliminarRol(objUsrRol);
				return true;
			} catch (Exception e) {
				// TODO: handle exception
				logger.info("Error en el consumo del servicio eliminar Rol. " +e.getMessage());
				throw new Exception(e.getMessage());
			}
		
	}
	
	
	

}
