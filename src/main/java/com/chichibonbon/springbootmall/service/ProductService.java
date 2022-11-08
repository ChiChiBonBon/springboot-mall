package com.chichibonbon.springbootmall.service;

import com.chichibonbon.springbootmall.dto.ProductRequest;
import com.chichibonbon.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
