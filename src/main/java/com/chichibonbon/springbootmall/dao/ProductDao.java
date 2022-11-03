package com.chichibonbon.springbootmall.dao;

import com.chichibonbon.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
