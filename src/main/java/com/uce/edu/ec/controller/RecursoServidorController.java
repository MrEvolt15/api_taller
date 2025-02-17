package com.uce.edu.ec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.edu.ec.modelo.RecursoServidor;
import com.uce.edu.ec.repository.RecursoServidorCustomRepository;


@RestController
@RequestMapping("/api/recursos")
@CrossOrigin
public class RecursoServidorController {

	 @Autowired
	    private RecursoServidorCustomRepository customRepository;

	    // Endpoint para obtener todos los recursos del servidor
	    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<RecursoServidor> obtenerRecursos() {
	        List<RecursoServidor> listConsulta = this.customRepository.obtenerTodosLosRecursos();
	        System.out.println(listConsulta);
	    	//return this.customRepository.obtenerTodosLosRecursos();
	    return listConsulta;
	    }
	
}
