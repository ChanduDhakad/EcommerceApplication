package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.exception.UserException;
import com.masai.model.Product;
import com.masai.model.User;
import com.masai.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product getProductDetailById(Integer productID) throws ProductException {
		
		return productRepository.findById(productID).orElseThrow(() -> new ProductException("Product Not found with ID: "+productID));
		
	}

	@Override
	public List<Product> getAllProductsDetails() throws ProductException {
		
           List<Product> products= productRepository.findAll();
		
		if(products.isEmpty())
			throw new UserException("No User find");
		
		return products;
	}
	
	
	
	
	
	
	
	
}
