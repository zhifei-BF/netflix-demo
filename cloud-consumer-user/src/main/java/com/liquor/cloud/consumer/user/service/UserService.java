package com.liquor.cloud.consumer.user.service;

import com.liquor.cloud.consumer.user.dao.UserDao;
import com.liquor.cloud.consumer.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUser(Integer id){
        User user = userDao.getUser(id);
        return user;
    }

    /**
     * 根据用户id查询用户和最新的电影票
     */
    public Map<String, Object> getUserAndMovie (Integer id){
        Map<String, Object> result = new HashMap<>();
        //1、查询用户信息
        User user = getUser(id);
        //2、查到最新电影票
        result.put("user", user);
        result.put("movie", null);//暂时为null
        return result;
    }

}
