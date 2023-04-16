package com.masai.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CartException;
import com.masai.exception.OrderException;
import com.masai.exception.ProductException;
import com.masai.exception.UserException;
import com.masai.exception.WishlistException;
import com.masai.model.Cart;
import com.masai.model.Order;
import com.masai.model.Product;
import com.masai.model.User;
import com.masai.model.Wishlist;
import com.masai.repository.CartRepository;


@Service
public  class CartServiceImpl implements CartService {

	
	
	@Autowired
	private CartRepository cartRepository;
	
	@Override
	public Cart addProductUserCart(Cart cart) throws CartException {
		
		  return cartRepository.save(cart);
		
	}
	


	
}
