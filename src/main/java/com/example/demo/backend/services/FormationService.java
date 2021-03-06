package com.example.demo.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.backend.entites.Formation;
import com.example.demo.backend.repositories.FormationRepositories;

@Service
public class FormationService {

	@Autowired
	private FormationRepositories repository;

	public <S extends Formation> S save(S entity) {
		return repository.save(entity);
	}

	public List<Formation> findAll() {
		return repository.findAll();
	}

	public List<Formation> findByTitre(String titre) {
		return repository.findByTitre(titre);
	}

	public Formation findById(Long id) {
		return repository.findById(id).orElseThrow( ()->new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
}
