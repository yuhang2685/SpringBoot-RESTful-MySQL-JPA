package com.yuhang.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.yuhang.demo.Alien;

/*
 * YH: 
 * "JpaRepository" is a extension of CrudRepository which also works.
 * The interface requires the class (table) name and the type of primary key.
 * We can leave the body empty because Spring does everything for us!
 * But we can also define some useful methods which are implemented by JPA.
 * Be aware that method name matters for JPA being able to implement.
 * For more complicated method, e.g., "findByPointsSorted" below,
 * we have to supply query.
 * The DB connection information is supplied in file application.properties.
 */

public interface AlienRepository extends JpaRepository<Alien, Integer>{

	List<Alien> findByPoints(int points);

	List<Alien> findByPointsGreaterThan(int points);
	
	// YH: Find the records with specific points and the results are sorted by name
	@Query("from Alien where points=?1 order by aname")
	List<Alien> findByPointsSorted(int points);
}