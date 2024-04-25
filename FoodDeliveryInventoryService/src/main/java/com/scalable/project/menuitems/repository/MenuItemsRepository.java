package com.scalable.project.menuitems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scalable.project.menuitems.entity.MenuItems;

@Repository
public interface MenuItemsRepository extends JpaRepository<MenuItems, Long> {

	List<MenuItems> findByRestaurantId(Long restaurantId);
	
	List<MenuItems> findByCategory(String category);

}
