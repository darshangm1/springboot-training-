package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.response.ProductResponse;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service

public class ProductService {

        private final ProductRepository productRepository;

 public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public ProductResponse processProduct(ProductRequest request) {

        int total_Price = request.getProduct_price() .stream()
                .mapToInt(Integer::intValue)
                .sum();
                int gst=18;
                double grand_total_price = (double) total_Price + (total_Price * gst / 100.0);

                Product product =  new Product();
                product.setCustomer_Name(request.getCustomer_name());
                product.setGST(gst);
                product.setTotal_Price(total_Price);
                product.setGrand_Total_Price((int) grand_total_price);

                productRepository.save(product);

                return new ProductResponse(request.getCustomer_name(), total_Price, (int) grand_total_price, gst);   

        
    }
public List<ProductResponse> getAllProducts() {
   return productRepository.findAll().stream()
            .map(product -> new ProductResponse(
                    product.getCustomer_Name(),
                    product.getTotal_Price(),
                    (int) product.getGrand_Total_Price(),
                    product.getGST()
            ))
            .toList();

   }
    
}
