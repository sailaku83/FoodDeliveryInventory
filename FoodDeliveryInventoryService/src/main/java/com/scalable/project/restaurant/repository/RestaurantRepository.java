package com.scalable.project.restaurant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scalable.project.restaurant.entity.Restaurants;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurants, Long> {

	List<Restaurants> findByName(String name);

}
