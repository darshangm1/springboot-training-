package com.example.demo.dto.response;

public class ProductResponse {

    private String customer_name;
    private int total_price;    
    private int grand_total_price;
    private int gst;
    
    public ProductResponse(String customer_name, int total_price, int grand_total_price, int gst) {
        this.customer_name = customer_name;
        this.total_price = total_price;
        this.grand_total_price = grand_total_price;
        this.gst = gst;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public int getGrand_total_price() {
        return grand_total_price;
    }

    public void setGrand_total_price(int grand_total_price) {
        this.grand_total_price = grand_total_price;
    }

    public int getGst() {
        return gst;
    }

    public void setGst(int gst) {
        this.gst = gst;
    }

    
}
