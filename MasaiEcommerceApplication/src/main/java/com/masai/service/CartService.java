package com.masai.service;
import java.util.List;

import com.masai.exception.CartException;
import com.masai.model.Cart;



public interface CartService {
	

	
	public Cart addProductUserCart(Cart cart)throws CartException;
	
	
}
