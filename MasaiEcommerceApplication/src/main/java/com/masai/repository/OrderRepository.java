package com.masai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Cart;

import com.masai.model.Order;



public interface OrderRepository extends JpaRepository<Order, Integer>{

	

}
