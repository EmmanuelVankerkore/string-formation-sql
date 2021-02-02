package com.example.demo.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.backend.services.ThemeService;

@RestController
@RequestMapping("theme")
@CrossOrigin
public class ThemeControllers {
	
	@Autowired
	private ThemeService service;
	
	

}
