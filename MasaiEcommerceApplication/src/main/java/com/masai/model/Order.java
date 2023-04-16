
package com.masai.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

 

  

    private Integer quantity;

    private String shippingAddress;

    private String paymentMethod;

     @Enumerated(EnumType.STRING)
    private Status status;
     
     @ManyToOne(cascade = CascadeType.ALL) 
     private List<User> users = new ArrayList<>();
     
     @ManyToMany(cascade = CascadeType.ALL) 
     private List<Product> products = new ArrayList<>();

   
}

