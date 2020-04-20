package com.luban.base.dao;

import com.luban.base.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> findAllUsers();
}
