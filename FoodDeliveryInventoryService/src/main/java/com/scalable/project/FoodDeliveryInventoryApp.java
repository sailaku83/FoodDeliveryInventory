package com.scalable.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.scalable.project.restaurant","com.scalable.project.menuitems"})
@EnableJpaRepositories(basePackages = {"com.scalable.project.restaurant.repository","com.scalable.project.menuitems.repository"})
@EntityScan(basePackages = {"com.scalable.project.restaurant.entity","com.scalable.project.menuitems.entity"})
public class FoodDeliveryInventoryApp {
	
	private static final Logger log = LoggerFactory.getLogger(FoodDeliveryInventoryApp.class);

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryInventoryApp.class, args);
	}
}
