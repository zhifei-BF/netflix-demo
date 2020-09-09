package com.liquor.cloud.consumer.user.controller;

import com.liquor.cloud.consumer.user.pojo.User;
import com.liquor.cloud.consumer.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(@RequestParam("id") Integer id){
        User user = userService.getUser(id);
        return user;
    }

    @GetMapping("/buyMovie")
    public Map<String, Object> buyMovie(@RequestParam("id")Integer id){
        Map<String, Object> map = userService.buyMovie(id);
        return map;
    }
}
