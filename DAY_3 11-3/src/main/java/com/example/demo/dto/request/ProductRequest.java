package com.example.demo.dto.request;

import java.util.List;  

public class ProductRequest {

    private String customer_name;
    private List<Integer> product_price;


    public String getCustomer_name() {
        return customer_name;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public List<Integer> getProduct_price() {
        return product_price;
    }
    public void setProduct_price(List<Integer> product_price) {
        this.product_price = product_price;
    }





    
}
