package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Cart;
import com.masai.model.Order;
import com.masai.model.User;
import com.masai.model.Wishlist;
import com.masai.service.CartService;
import com.masai.service.OrderService;
import com.masai.service.UserService;
import com.masai.service.WishlistService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/masaiEcommerce")
public class UserController {

	@Autowired
	private OrderService orderService;
		
	@Autowired
	private WishlistService wishlistService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private CartService cartService;
	
	@PostMapping("/register")
	public ResponseEntity<User> saveUserHandler(@RequestBody User User){
		
		User.setPassword(passwordEncoder.encode(User.getPassword()));
		
		User registeredUser= userService.registerUser(User);
		
		return new ResponseEntity<>(registeredUser,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/orders/history/{userId}")
	public ResponseEntity<List<Order>> getAllOrdersHandler(@PathVariable("userId") Integer userId){
		
		
		List<Order> User= orderService.allOrders(userId);
		
		return new ResponseEntity<>(User,HttpStatus.OK);
		
	}
	
	@GetMapping("/wishlist/add")
	public ResponseEntity<Wishlist> getAllUserHandler(@Validated @RequestBody Wishlist wishlist ){
		
		
		Wishlist wl= wishlistService.addWishlist(wishlist);
		
		return new ResponseEntity<>(wl,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/cart")
	public ResponseEntity<Cart> addCartHandler(@Validated @RequestBody Cart cart ){
		
		
		Cart wl= cartService.addProductUserCart(cart);
		
		return new ResponseEntity<>(wl,HttpStatus.ACCEPTED);
		
	}
	
}
