package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;    

   private String customer_name;
   private int GST;
   private int total_price;
   private int grand_total_price;


   public Long getId() {
    return id;
   }
   public void setId(Long id) {
    this.id = id;
   }
   public String getCustomer_Name() {
    return customer_name;
   }
   public void setCustomer_Name(String customer_Name) {
    customer_name = customer_Name;
   }
   public int getGST() {
    return GST;
   }
   public void setGST(int gST) {
    GST = gST;
   }
   public int getTotal_Price() {
    return total_price;
   }
   public void setTotal_Price(int total_price) {
    this.total_price = total_price;
   }
   public int getGrand_Total_Price() {
    return grand_total_price;
   }
   public void setGrand_Total_Price(int grand_total_price) {
    this.grand_total_price = grand_total_price;
   }
}