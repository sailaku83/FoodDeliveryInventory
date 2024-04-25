

CREATE TABLE IF NOT EXISTS restaurants (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    city VARCHAR(100) NOT NULL,
    state VARCHAR(100) NOT NULL,
    zip_code VARCHAR(20) NOT NULL,
    phone_number VARCHAR(20),
    email VARCHAR(255),
    cuisine_type VARCHAR(100),
    opening_hours VARCHAR(255),
    delivery_fee DECIMAL(10, 2),
    minimum_order_amount DECIMAL(10, 2),
    active BOOLEAN NOT NULL DEFAULT TRUE
);

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE IF NOT EXISTS `menu_items` (
  `id` int NOT NULL AUTO_INCREMENT,
  `restaurant_id` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` text,
  `price` decimal(10,2) NOT NULL,
  `category` varchar(50) DEFAULT NULL,
  `is_vegetarian` tinyint(1) DEFAULT NULL,
  `is_vegan` tinyint(1) DEFAULT NULL,
  `is_gluten_free` tinyint(1) DEFAULT NULL,
  `is_spicy` tinyint(1) DEFAULT NULL,
  `is_available` tinyint(1) DEFAULT '1',
  `image_url` varchar(255) DEFAULT NULL,
  `preparation_time` int DEFAULT NULL,
  `allergen_info` text,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `restaurant_id` (`restaurant_id`),
  CONSTRAINT `menu_items_ibfk_1` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurants` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;