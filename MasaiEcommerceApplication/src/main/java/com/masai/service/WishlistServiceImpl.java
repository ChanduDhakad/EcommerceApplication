package com.masai.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.exception.UserException;
import com.masai.exception.WishlistException;
import com.masai.model.Product;
import com.masai.model.User;
import com.masai.model.Wishlist;
import com.masai.repository.UserRepository;
import com.masai.repository.WishlistRepository;


@Service
public class WishlistServiceImpl implements WishlistService {

	
	@Autowired
	WishlistRepository wishlistRepo;
	
	@Autowired
	UserRepository userRepo;
	
	@Override
	public Wishlist addWishlist(Wishlist wishlist) throws WishlistException {

		
		return wishlistRepo.save(wishlist);
	
		 
	}
	

	
	
}
