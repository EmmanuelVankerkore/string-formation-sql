package com.example.demo.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.backend.entites.Formation;

public interface FormationRepositories extends JpaRepository<Formation, Long>{

	public List<Formation> findByTitre(String titre);
	public List<Formation> findByDescription(String description);
}
