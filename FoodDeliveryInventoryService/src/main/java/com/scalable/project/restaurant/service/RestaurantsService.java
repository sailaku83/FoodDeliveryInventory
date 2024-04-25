package com.scalable.project.restaurant.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scalable.project.FoodDeliveryInventoryApp;
import com.scalable.project.restaurant.entity.Restaurants;
import com.scalable.project.restaurant.repository.RestaurantRepository;


@Service
public class RestaurantsService {

	@Autowired
	private RestaurantRepository restuarantRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Value("${authURL}")
	private String authURL;
	

	@Value("${tokenUserName}")
	private String getTokenUserName;

	@Value("${tokenpassword}")
	private String getTokenPasswordName;
	
	private static final Logger log = LoggerFactory.getLogger(RestaurantsService.class);

	public List<Restaurants> findAll() {
		return restuarantRepository.findAll();
	}

	public Optional<Restaurants> findById(Long id) {
		return restuarantRepository.findById(id);
	}

	public Restaurants save(String userName,Restaurants Restaurants) throws Exception {
		if(!isAuthorized(authURL, userName, "Add Menu")) {
			throw new Exception("Not Authorised");
		}
		return restuarantRepository.save(Restaurants);
	}

	public void deleteById(Long id) {
		/*
		 * if(!isAuthorized(authURL, userName, "Delete Menu")) { throw new
		 * Exception("Not Authorised"); }
		 */
		restuarantRepository.deleteById(id);
	}

	public List<Restaurants> findByName(String name) {
		return restuarantRepository.findByName(name);
	}

	
	public boolean getToken(String url, String userName, String password) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		Map<String, Object> jsonDataMap = new HashMap<>();
		jsonDataMap.put("username", userName);
		jsonDataMap.put("password", password);

		// Convert map to JSON string
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonData = null;
		try {
			jsonData = objectMapper.writeValueAsString(jsonDataMap);
		} catch (JsonProcessingException e) {
			log.error("Error in authorize call" + e.getMessage());
			return false;
		}
		
		HttpEntity<Object> requestEntity = new HttpEntity<>(jsonData, headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
		// You can handle the response here if needed
		log.info("Response: " + responseEntity.getBody());
		return true;
	}
	
	
	public boolean isAuthorized(String url, String userName, String operation) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		Map<String, Object> jsonDataMap = new HashMap<>();
		jsonDataMap.put("name", "userName");
		jsonDataMap.put("age", 30);

		// Convert map to JSON string
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonData = null;
		try {
			jsonData = objectMapper.writeValueAsString(jsonDataMap);
		} catch (JsonProcessingException e) {
			log.error("Error in authorize call" + e.getMessage());
			return false;
		}
		
		HttpEntity<Object> requestEntity = new HttpEntity<>(jsonData, headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
		// You can handle the response here if needed
		log.info("Response: " + responseEntity.getBody());
		return true;
	}

}
