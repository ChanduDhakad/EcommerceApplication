package com.masai.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.OrderException;
import com.masai.exception.ProductException;
import com.masai.exception.UserException;
import com.masai.exception.WishlistException;
import com.masai.model.Order;
import com.masai.model.Product;
import com.masai.model.User;
import com.masai.model.Wishlist;
import com.masai.repository.OrderRepository;
import com.masai.repository.UserRepository;


@Service
public class OrderServiceImpl implements OrderService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	@Override
	public List<Order> allOrders(Integer userID) throws OrderException, UserException {
	
		  User user=userRepository.findById(userID).orElseThrow(()-> new UserException("User Not exist with userID "+userID));
		 List<Order>orders= user.getOrders();
		 
		 if(orders.size()==0) throw new OrderException("Order list is empty");
		
		 return orders;
	}
	

	
	
	
}
