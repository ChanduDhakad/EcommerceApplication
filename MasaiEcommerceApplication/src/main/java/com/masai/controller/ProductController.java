package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Product;
import com.masai.model.User;
import com.masai.service.ProductService;


import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/masaiEcommerce")
public class ProductController {

	
		
	
	@Autowired
	private ProductService productService;
	
 
	
	@PostMapping("/products")
	public ResponseEntity<List<Product>> allProductHandler(){
		
	
		
		List<Product> products= productService.getAllProductsDetails();
		
		return new ResponseEntity<>(products,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductByIDHandler(@PathVariable("id") Integer id){
		
		
		Product User= productService.getProductDetailById(id);
		
		return new ResponseEntity<>(User,HttpStatus.ACCEPTED);
		
	}
	
	
	
	
}
