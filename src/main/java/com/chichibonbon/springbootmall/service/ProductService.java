package com.chichibonbon.springbootmall.service;

import com.chichibonbon.springbootmall.dto.ProductQueryParams;
import com.chichibonbon.springbootmall.dto.ProductRequest;
import com.chichibonbon.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
