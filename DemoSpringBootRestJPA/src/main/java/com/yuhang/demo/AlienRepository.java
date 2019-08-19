package com.yuhang.demo;

import org.springframework.data.repository.CrudRepository;

//YH: We use this interface to work with database.

public interface AlienRepository extends CrudRepository<Alien, Integer>{
	
	// YH: Leave it empty and don't need to do anything! Spring does everything for us!
}
