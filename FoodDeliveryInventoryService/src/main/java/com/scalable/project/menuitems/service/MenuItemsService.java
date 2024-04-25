package com.scalable.project.menuitems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalable.project.menuitems.repository.MenuItemsRepository;
import com.scalable.project.menuitems.entity.MenuItems;

@Service
public class MenuItemsService {
	
	 @Autowired
	    private MenuItemsRepository menuItemsRepository;

	    public List<MenuItems> findAll() {
	        return menuItemsRepository.findAll();
	    }

	    public Optional<MenuItems> findById(Long id) {
	        return menuItemsRepository.findById(id);
	    }

	    public MenuItems save(MenuItems MenuItems) {
	        return menuItemsRepository.save(MenuItems);
	    }

	    public void deleteById(Long id) {
	        menuItemsRepository.deleteById(id);
	    }

	    public List<MenuItems> findByRestaurantId(Long restaurantId) {
	        return menuItemsRepository.findByRestaurantId(restaurantId);
	    }

		public List<MenuItems> findByCategory(String category) {
			return menuItemsRepository.findByCategory(category);
		}


}
