package com.masai.service;
import java.util.List;

import com.masai.exception.OrderException;
import com.masai.exception.ProductException;
import com.masai.exception.UserException;
import com.masai.exception.WishlistException;
import com.masai.model.Order;
import com.masai.model.Product;
import com.masai.model.User;
import com.masai.model.Wishlist;

public interface OrderService {
	

	
	public List<Order> allOrders(Integer userID)throws OrderException,UserException;
	
	
}
