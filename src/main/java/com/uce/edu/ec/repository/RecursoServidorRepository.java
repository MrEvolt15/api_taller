package com.uce.edu.ec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uce.edu.ec.modelo.RecursoServidor;


public interface RecursoServidorRepository extends JpaRepository<RecursoServidor, Long> {

}
