package com.chichibonbon.springbootmall.dao;

import com.chichibonbon.springbootmall.dto.ProductRequest;
import com.chichibonbon.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
