package com.liquor.cloud.consumer.user.service;

import com.liquor.cloud.consumer.user.dao.UserDao;
import com.liquor.cloud.consumer.user.pojo.Movie;
import com.liquor.cloud.consumer.user.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    RestTemplate restTemplate;

    public User getUser(Integer id){
        User user = userDao.getUser(id);
        return user;
    }

//    /**
//     * 根据用户id查询用户和最新的电影票
//     */
//    public Map<String, Object> getUserAndMovie (Integer id){
//        Map<String, Object> result = new HashMap<>();
//        //1、查询用户信息
//        User user = getUser(id);
//        //2、查到最新电影票
//        result.put("user", user);
//        result.put("movie", null);//暂时为null
//        return result;
//    }

    public Map<String,Object> hystrix(Integer id){
        Map<String, Object> result = new HashMap<>();
        User user = getUser(id);
        Movie movie = new Movie();
        movie.setId(2);
        movie.setMovieName("八佰第二部");
        result.put("user",user);
        result.put("movie",movie);
        return result;
    }

    @HystrixCommand(fallbackMethod = "hystrix")
    public Map<String,Object> buyMovie(Integer id){
        Map<String, Object> result = new HashMap<>();
        User user = getUser(id);
        Movie movie = restTemplate.getForObject("http://CLOUD-PROVIDER-MOVIE/movie", Movie.class);
        result.put("user",user);
        result.put("movie",movie);
        return result;
    }
}
