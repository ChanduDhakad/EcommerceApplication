package com.masai.service;
import java.util.List;

import com.masai.exception.ProductException;
import com.masai.exception.UserException;
import com.masai.model.Product;
import com.masai.model.User;

public interface ProductService {
	

	
	public Product getProductDetailById(Integer productID)throws ProductException;
	
	public List<Product> getAllProductsDetails()throws ProductException;

}
