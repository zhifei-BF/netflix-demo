package com.liquor.cloud.provider.movie.controller;

import com.liquor.cloud.provider.movie.pojo.Movie;
import com.liquor.cloud.provider.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping("/movie")
    public Movie getNewMovie(){
        return movieService.getNewMovie();
    }
}
