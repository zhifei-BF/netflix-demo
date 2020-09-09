package com.liquor.cloud.consumer.user.dao;

import com.liquor.cloud.consumer.user.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public User getUser(Integer id){
        User user = new User();
        user.setId(id);
        user.setName("蒋介石");
        return user;
    }

}
