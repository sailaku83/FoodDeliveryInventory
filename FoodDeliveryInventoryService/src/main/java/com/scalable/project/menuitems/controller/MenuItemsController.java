package com.scalable.project.menuitems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.scalable.project.menuitems.entity.MenuItems;
import com.scalable.project.menuitems.service.MenuItemsService;

@RestController
@RequestMapping("/menuitems")
public class MenuItemsController {
	
    @Autowired
    private MenuItemsService menuItemsService;

    @GetMapping
    public List<MenuItems> findAll() {
        return menuItemsService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<MenuItems> findById(@PathVariable Long id) {
        return menuItemsService.findById(id);
    }

    // create a MenuItems
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public MenuItems create(@RequestBody MenuItems restaurants) {
        return menuItemsService.save(restaurants);
    }

    // update a MenuItems
    @PutMapping
    public MenuItems update(@RequestBody MenuItems restaurants) {
        return menuItemsService.save(restaurants);
    }

    // delete a MenuItems
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
    	menuItemsService.deleteById(id);
    }

    @GetMapping("/find/items/restaurantId/{restaurantId}")
    public List<MenuItems> findByRestaurantId(@PathVariable Long restaurantId) {
        return menuItemsService.findByRestaurantId(restaurantId);
    }
    
    @GetMapping("/find/items/category/{category}")
    public List<MenuItems> findByCategory(@PathVariable String category) {
        return menuItemsService.findByCategory(category);
    }

}
