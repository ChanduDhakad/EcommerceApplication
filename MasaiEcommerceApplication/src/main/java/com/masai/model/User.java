package com.masai.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String email;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

   
    private String firstName;


    private String lastName;

    private String address;

    private String city;

    private String state;

    private Integer zipCode;

    private String country;

    @OneToMany( cascade  = CascadeType.ALL)
    private List<Cart> carts = new ArrayList<>();

    @OneToMany( cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();

    @OneToMany( cascade = CascadeType.ALL)
    private List<Wishlist> wishlists = new ArrayList<>();

   
}
