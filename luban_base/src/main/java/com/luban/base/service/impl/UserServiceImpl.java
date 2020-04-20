package com.luban.base.service.impl;

import com.luban.base.dao.UserMapper;
import com.luban.base.entity.User;
import com.luban.base.service.UserService;
import com.luban.commons.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public ResultEntity findAllUser() {

        List<User> allUsers = userMapper.findAllUsers();

        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setData(allUsers);
        resultEntity.setMessage("查询数据成功");
        resultEntity.setReturnCode("400");

        return resultEntity;
    }
}
