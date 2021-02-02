package com.example.demo.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.backend.entites.Theme;

public interface ThemeRepositories extends JpaRepository<Theme, Long>{

	public List<Theme> findByNom(String nom);
	public List<Theme> findByDescription(String description);
}
