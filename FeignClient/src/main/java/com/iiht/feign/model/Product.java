package com.iiht.feign.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Product {
	
	Integer productId;
	String name;
	String category;
	String brand;
	double price;
	

}
