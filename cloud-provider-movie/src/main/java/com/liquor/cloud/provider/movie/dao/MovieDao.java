package com.liquor.cloud.provider.movie.dao;

import com.liquor.cloud.provider.movie.pojo.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {
    public Movie getNewMovie(){
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("八佰");
        return movie;
    }
}
