package com.chichibonbon.springbootmall.service.impl;

import com.chichibonbon.springbootmall.dao.ProductDao;
import com.chichibonbon.springbootmall.model.Product;
import com.chichibonbon.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
