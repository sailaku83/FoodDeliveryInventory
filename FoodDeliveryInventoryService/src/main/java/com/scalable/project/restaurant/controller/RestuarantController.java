package com.scalable.project.restaurant.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.scalable.project.restaurant.entity.Restaurants;
import com.scalable.project.restaurant.service.RestaurantsService;

@RestController
@RequestMapping("/restaurants")
public class RestuarantController {
	
    @Autowired
    private RestaurantsService restaurantsService;
    
	private static final Logger log = LoggerFactory.getLogger(RestuarantController.class);


    @GetMapping
    public List<Restaurants> findAll() {
        return restaurantsService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Restaurants> findById(@PathVariable Long id) {
        return restaurantsService.findById(id);
    }

    // create a Restaurants
   // @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public ResponseEntity<Restaurants> create(@RequestHeader(name="user")String userName,@RequestBody Restaurants restaurants) {
        try {
        	Restaurants savedRestaurant = restaurantsService.save(userName,restaurants);
			return new ResponseEntity(savedRestaurant, HttpStatus.CREATED);
		} catch (Exception e) {
			log.error("Exception in Save restaurent" + e.getMessage());
			return new ResponseEntity(null, HttpStatus.UNAUTHORIZED);
		}
    }

    // update a Restaurants
    @PutMapping
    public ResponseEntity<Restaurants> update(@RequestHeader(name="user")String userName,@RequestBody Restaurants restaurants) {
    	 try {
         	Restaurants savedRestaurant = restaurantsService.save(userName,restaurants);
 			return new ResponseEntity(savedRestaurant, HttpStatus.OK);
 		} catch (Exception e) {
 			log.error("Exception in update restaurent" + e.getMessage());
 			return new ResponseEntity(null, HttpStatus.UNAUTHORIZED);
 		}
    }

    // delete a Restaurants
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
    	restaurantsService.deleteById(id);
    }

    @GetMapping("/find/name/{name}")
    public List<Restaurants> findByName(@PathVariable String name) {
        return restaurantsService.findByName(name);
    }

	/*
	 * @GetMapping("/find/date-after/{date}") public List<Restaurants>
	 * findByPublishedDateAfter(
	 * 
	 * @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
	 * return RestaurantsService.findByPublishedDateAfter(date); }
	 */


}
