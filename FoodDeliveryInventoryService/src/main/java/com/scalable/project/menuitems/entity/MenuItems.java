package com.scalable.project.menuitems.entity;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "menu_items") 
public class MenuItems {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	    @Column(name = "restaurant_id") 
	    private Long restaurantId;
	    @Column(name = "name") 
	    private String name;
	    @Column(name = "description") 
	    private String description;
	    @Column(name = "price") 
	    private BigDecimal price;
	    @Column(name = "category") 
	    private String category;
	    @Column(name = "is_vegetarian") 
	    private boolean vegetarian;
	    @Column(name = "is_vegan") 
	    private boolean vegan;
	    @Column(name = "is_gluten_free") 
	    private boolean glutenFree;
	    @Column(name = "is_available") 
	    private boolean available;
	    @Column(name = "is_spicy")
	    private boolean spicy;
	    @Column(name = "image_url") 
	    private String imageUrl;
	    @Column(name = "preparation_time") 
	    private Integer preparationTime;
	    @Column(name = "allergen_info") 
	    private String allergenInfo;
	    @Column(name = "created_at") 
	    @Temporal(TemporalType.TIMESTAMP)
	    private java.util.Date createdTime;
	    @Column(name = "updated_at") 
	    private java.util.Date updatedTime;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getRestaurantId() {
			return restaurantId;
		}
		public void setRestaurantId(Long restaurantId) {
			this.restaurantId = restaurantId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public boolean isVegetarian() {
			return vegetarian;
		}
		public void setVegetarian(boolean vegetarian) {
			this.vegetarian = vegetarian;
		}
		public boolean isVegan() {
			return vegan;
		}
		public void setVegan(boolean vegan) {
			this.vegan = vegan;
		}
		public boolean isGlutenFree() {
			return glutenFree;
		}
		public void setGlutenFree(boolean glutenFree) {
			this.glutenFree = glutenFree;
		}
		public boolean isAvailable() {
			return available;
		}
		public void setAvailable(boolean available) {
			this.available = available;
		}
		public boolean isSpicy() {
			return spicy;
		}
		public void setSpicy(boolean spicy) {
			this.spicy = spicy;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		public Integer getPreparationTime() {
			return preparationTime;
		}
		public void setPreparationTime(Integer preparationTime) {
			this.preparationTime = preparationTime;
		}
		public String getAllergenInfo() {
			return allergenInfo;
		}
		public void setAllergenInfo(String allergenInfo) {
			this.allergenInfo = allergenInfo;
		}
		public Date getCreatedTime() {
			return createdTime;
		}
		public void setCreatedTime(Date createdTime) {
			this.createdTime = createdTime;
		}
		public Date getUpdatedTime() {
			return updatedTime;
		}
		public void setUpdatedTime(Date updatedTime) {
			this.updatedTime = updatedTime;
		}
		@Override
		public String toString() {
			return "MenuItems [id=" + id + ", restaurantId=" + restaurantId + ", name=" + name + ", description="
					+ description + ", price=" + price + ", category=" + category + ", isVegetarian=" + vegetarian
					+ ", isVegan=" + vegan + ", isGlutenFree=" + glutenFree + ", isAvailable=" + available
					+ ", isSpicy=" + spicy + ", imageUrl=" + imageUrl + ", preparationTime=" + preparationTime
					+ ", allergenInfo=" + allergenInfo + ", createdTime=" + createdTime + ", updatedTime=" + updatedTime
					+ "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(allergenInfo, category, createdTime, description, id, imageUrl, available,
					glutenFree, spicy, vegan, vegetarian, name, preparationTime, price, restaurantId,
					updatedTime);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MenuItems other = (MenuItems) obj;
			return Objects.equals(allergenInfo, other.allergenInfo) && Objects.equals(category, other.category)
					&& Objects.equals(createdTime, other.createdTime) && Objects.equals(description, other.description)
					&& Objects.equals(id, other.id) && Objects.equals(imageUrl, other.imageUrl)
					&& available == other.available && glutenFree == other.glutenFree
					&& isSpicy == other.isSpicy && vegan == other.vegan && vegetarian == other.vegetarian
					&& Objects.equals(name, other.name) && Objects.equals(preparationTime, other.preparationTime)
					&& Objects.equals(price, other.price) && Objects.equals(restaurantId, other.restaurantId)
					&& Objects.equals(updatedTime, other.updatedTime);
		}
	  
	    
}
