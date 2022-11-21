package com.chichibonbon.springbootmall.dao;

import com.chichibonbon.springbootmall.dto.UserRegisterRequest;
import com.chichibonbon.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer UserId);
}
