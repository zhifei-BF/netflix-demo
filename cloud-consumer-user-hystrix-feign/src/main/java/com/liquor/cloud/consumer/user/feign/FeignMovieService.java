package com.liquor.cloud.consumer.user.feign;

import com.liquor.cloud.consumer.user.exception.MovieServiceFeignHanlderException;
import com.liquor.cloud.consumer.user.pojo.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "CLOUD-PROVIDER-MOVIE",fallback = MovieServiceFeignHanlderException.class)
public interface FeignMovieService {
    @GetMapping("/movie")
    public Movie getNewMovie();
}
