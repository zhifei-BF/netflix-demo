package com.liquor.cloud.consumer.user.feign;

import com.liquor.cloud.provider.movie.pojo.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value = "CLOUD-PROVIDER-MOVIE")
public interface MovieServiceFeign {
    @GetMapping("/movie")
    public Movie getNewMovie();
}
