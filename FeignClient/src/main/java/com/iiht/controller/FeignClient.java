package com.iiht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.feign.ifaces.FeignInterface;
import com.iiht.feign.model.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/client")
public class FeignClient {
	
	 @Autowired
	 private FeignInterface feignclient;
	 
		/*
		 * Environment environment;
		 */	 

	 
	 @CircuitBreaker(name="client-cb", fallbackMethod="generateResponse")
	 @GetMapping("/allProducts")
	 public List<Product> getAll() { 

		  return feignclient.getProducts();

	 }

	//http://localhost:7082/client/products-by-id/2

	 @GetMapping("/products-by-id/{id}")
	 public Product getProductById(@PathVariable ("id") int id) {

		   System.out.println(id);

		   return feignclient.getProductsById(id);

	 }
	 
	 // http://localhost:7082/client/products-by-category/Mobile

	 @GetMapping("/products-by-category/{category}")
	 public List<Product> getProductsByCategory(@PathVariable("category") String category){

		 return feignclient.getProductsByCategory(category);

	 }
	 
	 
	 public String generateResponse(Throwable throwable) {
		 return "the server is unavailible, please try again later";
		 
	 }

}
