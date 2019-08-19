package com.yuhang.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Denote that this is for REST APIs.
// Note that in Jersey, it uses @Path.
// JDBC is contained in application.properties.

@RestController
public class AlienResource {

	@Autowired
	AlienRepository repo;
	
	@RequestMapping("aliens")
	public List<Alien> getAliens(){
		
		List<Alien> aliens = (List<Alien>) repo.findAll();
		return aliens;
	}
	
	@PostMapping("addAlien")
	public void addAlien(@RequestBody Alien a) {
		repo.save(a);
	}
}
