package com.chichibonbon.springbootmall.service.impl;

import com.chichibonbon.springbootmall.dao.UserDao;
import com.chichibonbon.springbootmall.dto.UserRegisterRequest;
import com.chichibonbon.springbootmall.model.User;
import com.chichibonbon.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
