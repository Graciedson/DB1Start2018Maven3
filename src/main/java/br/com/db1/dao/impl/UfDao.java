package br.com.db1.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.db1.dao.DAO;
import br.com.db1.model.Uf;

public class UfDao implements DAO <Uf>{
	
	
	private EntityManager manager;
	
	public UfDao(EntityManager manager) {
		this.manager = manager;
	}

	public List<Uf> findAll() {
		
		return manager.createQuery("from uf").getResultList();
	}

	public Uf findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Uf> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Uf t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
