package com.liquor.cloud.consumer.user.exception;

import com.liquor.cloud.consumer.user.feign.FeignMovieService;
import com.liquor.cloud.consumer.user.pojo.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieServiceFeignHanlderException implements FeignMovieService {
    /**
     * 远程这个方法调用出问题就会调用此方法
     */
    @Override
    public Movie getNewMovie() {
        Movie movie = new Movie();
        movie.setId(-100);
        movie.setMovieName("无此电影呀...");
        return movie;
    }

}
