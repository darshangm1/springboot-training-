package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.response.ApiResponse;
import com.example.demo.dto.response.ProductResponse;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")

public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    
}

@PostMapping("/process")
public ApiResponse<ProductResponse> processProduct(@RequestBody ProductRequest request) {
    ProductResponse result = productService.processProduct(request);
    return new ApiResponse<>("Success", result);
}

@GetMapping("/results")
public ApiResponse<List<ProductResponse>> getAllProducts() {
    List<ProductResponse> result = productService.getAllProducts();
    return new ApiResponse<>("Success", result);
}
}