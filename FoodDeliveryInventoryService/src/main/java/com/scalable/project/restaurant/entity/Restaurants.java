package com.scalable.project.restaurant.entity;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurants") 
public class Restaurants {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	    @Column(name = "name") 
	    private String name;
	    @Column(name = "address") 
	    private String address;
	    @Column(name = "city") 
	    private String city;
	    @Column(name = "state") 
	    private String state;
	    @Column(name = "zip_code") 
	    private String zipCode;
	    @Column(name = "phone_number") 
	    private String phoneNumber;
	    @Column(name = "email") 
	    private String email;
	    @Column(name = "cuisine_type") 
	    private String cuisine;
	    @Column(name = "opening_hours") 
	    private String openingHours;
	    @Column(name = "delivery_fee") 
	    private BigDecimal deliveryFee;
	    @Column(name = "minimum_order_amount") 
	    private BigDecimal minimumOrderAmount;
	    @Column(name = "active") 
	    private boolean active;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZipCode() {
			return zipCode;
		}
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCuisine() {
			return cuisine;
		}
		public void setCuisine(String cuisine) {
			this.cuisine = cuisine;
		}
		public String getOpeningHours() {
			return openingHours;
		}
		public void setOpeningHours(String openingHours) {
			this.openingHours = openingHours;
		}
		public BigDecimal getDeliveryFee() {
			return deliveryFee;
		}
		public void setDeliveryFee(BigDecimal deliveryFee) {
			this.deliveryFee = deliveryFee;
		}
		public BigDecimal getMinimumOrderAmount() {
			return minimumOrderAmount;
		}
		public void setMinimumOrderAmount(BigDecimal minimumOrderAmount) {
			this.minimumOrderAmount = minimumOrderAmount;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		@Override
		public String toString() {
			return "Restaurants [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", state="
					+ state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + ", email=" + email
					+ ", cuisine=" + cuisine + ", openingHours=" + openingHours + ", deliveryFee=" + deliveryFee
					+ ", minimumOrderAmount=" + minimumOrderAmount + ", active=" + active + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(active, address, city, cuisine, deliveryFee, email, id, minimumOrderAmount, name,
					openingHours, phoneNumber, state, zipCode);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Restaurants other = (Restaurants) obj;
			return active == other.active && Objects.equals(address, other.address) && Objects.equals(city, other.city)
					&& Objects.equals(cuisine, other.cuisine) && Objects.equals(deliveryFee, other.deliveryFee)
					&& Objects.equals(email, other.email) && Objects.equals(id, other.id)
					&& Objects.equals(minimumOrderAmount, other.minimumOrderAmount) && Objects.equals(name, other.name)
					&& Objects.equals(openingHours, other.openingHours)
					&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(state, other.state)
					&& Objects.equals(zipCode, other.zipCode);
		}
	    
	    

}
