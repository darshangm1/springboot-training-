package com.example.demo.dto.response;

public class ProductResponse {

    private String customer_name;
    private double total_amount;
    private double final_amount;
    private double gst;
    
    public ProductResponse(String customer_name, double total_amount, double final_amount, double gst) {
        this.customer_name = customer_name;
        this.total_amount = total_amount;
        this.final_amount = final_amount;
        this.gst = gst;
    }
    public String getCustomer_name() {
        return customer_name;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public double getTotal_amount() {
        return total_amount;
    }
    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
    public double getFinal_amount() {
        return final_amount;
    }
    public void setFinal_amount(double final_amount) {
        this.final_amount = final_amount;
    }
    public double getGst() {
        return gst;
    }
    public void setGst(double gst) {
        this.gst = gst;
    }
}
   