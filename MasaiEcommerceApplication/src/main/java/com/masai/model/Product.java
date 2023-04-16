package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

  
    private String name;

    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;

 
    private Integer price;
    
    
    @ManyToMany(cascade = CascadeType.ALL) 
    private List<Wishlist> Wishlists = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL) 
    private List<Cart> carts = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL) 
    private List<Order> orders = new ArrayList<>();

}

