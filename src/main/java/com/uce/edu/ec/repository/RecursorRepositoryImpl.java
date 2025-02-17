package com.uce.edu.ec.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.modelo.RecursoServidor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class RecursorRepositoryImpl implements RecursoServidorCustomRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<RecursoServidor> obtenerTodosLosRecursos() {
		// TODO Auto-generated method stub
		TypedQuery<RecursoServidor> query = entityManager.createQuery("SELECT r FROM RecursoServidor r", RecursoServidor.class);
        return query.getResultList();
	}

}
