package com.yuhang.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * YH: 
 * In RESTful APIs, Spring Boot by-default supports JSON format.
 * We need dependency "Maven Jackson" to convert normal object result into XML format.
 * We use "Content Negotiation" to specify the data format we want.  
 */
@RestController
public class AlienResource {

	// YH: repo is generated by Spring in bean.
	@Autowired
	AlienRepository repo;
	
	// YH: "produces" in @RequestMapping restricts the service only provides results in XML 
	@RequestMapping(path="aliens", produces= {"application/xml"})
	public List<Alien> getAliens(){		
		
		List<Alien> aliens = (List<Alien>) repo.findAll();
		return aliens;
	}
	
	 
	//YH: To handle the case of not found, we use type "Optional<Alien>"
	@RequestMapping("alien/{id}")
	public Optional<Alien> getAlien(@PathVariable("id") int aid){
		
		Optional<Alien> alien = repo.findById(aid);
		return alien;
	}
	
	
	// YH: "consume" in @RequestMapping restricts the service only accept input in XML 	
	@PostMapping(path="addAlien", consumes= {"application/json"})
	public void addAlien(@RequestBody Alien a) {
		
		repo.save(a);
	}
	
	
	@PutMapping("alien")
	public void updateAlien(@RequestBody Alien a){
		
		repo.save(a);
	}
	
	
	@DeleteMapping("alien/{id}")
	public void delAlien(@PathVariable("id") int aid){
		
		Alien alien = repo.getOne(aid);
		repo.delete(alien);
	}
	
	// YH: Below are some example requests handled by customized JPA methods.
	@RequestMapping("aliensPoints70")
	public List<Alien> getAliensPoints70(){		
		
		List<Alien> aliens = (List<Alien>) repo.findByPoints(70);
		return aliens;
	}
	
	@RequestMapping("aliensPointsGT50")
	public List<Alien> getAliensPointsGT50(){		
		
		List<Alien> aliens = (List<Alien>) repo.findByPointsGreaterThan(50);
		return aliens;
	}
	
	@RequestMapping("aliensPoints70Sorted")
	public List<Alien> getAliensPoints70Sorted(){		
		
		List<Alien> aliens = (List<Alien>) repo.findByPointsSorted(70);
		return aliens;
	}

}
