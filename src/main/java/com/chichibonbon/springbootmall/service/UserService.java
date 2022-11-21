package com.chichibonbon.springbootmall.service;

import com.chichibonbon.springbootmall.dto.UserRegisterRequest;
import com.chichibonbon.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
