package com.chichibonbon.springbootmall.dao;

import com.chichibonbon.springbootmall.dto.ProductRequest;
import com.chichibonbon.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
