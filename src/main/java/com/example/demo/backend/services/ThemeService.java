package com.example.demo.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.backend.entites.Formation;
import com.example.demo.backend.entites.Theme;
import com.example.demo.backend.repositories.ThemeRepositories;

@Service
public class ThemeService {

	@Autowired
	private ThemeRepositories repository;

	public Theme findByName(String nom) {
		return repository.findByNom(nom);
	}

	public <S extends Theme> S save(S entity) {
		return repository.save(entity);
	}

	public Theme findById(Long id) {
		return repository.findById(id).orElseThrow( ()->new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	
}
