package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.response.ProductResponse;

@Service

public class ProductService {

    public ProductResponse calProductResponse(ProductRequest pro) {
       double total_amount=0.0;
        double gst=18.0;
        double final_amount=0.0;

        total_amount=pro.getProduct1()+pro.getProduct2()+pro.getProduct3()+pro.getProduct4()+pro.getProduct5()+pro.getProduct6()+pro.getProduct7()+pro.getProduct8()+pro.getProduct9()+pro.getProduct10();
        final_amount=total_amount+(total_amount*gst/100);

        ProductResponse response=new ProductResponse(pro.getCustomer_name(),total_amount,final_amount,gst);
        return response;
    

    }
     
}
