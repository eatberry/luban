package com.luban.base.controller;


import com.luban.base.service.UserService;
import com.luban.commons.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public ResultEntity selectAllUsers(){
        return userService.findAllUser();
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
