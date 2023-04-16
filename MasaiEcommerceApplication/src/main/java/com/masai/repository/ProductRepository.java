package com.masai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Cart;

import com.masai.model.Order;
import com.masai.model.Product;



public interface ProductRepository extends JpaRepository<Product, Integer>{

	

}
