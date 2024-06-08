package com.backend.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository MovieRepository;
    public List<Movie> AllMovies(){
        return MovieRepository.findAll();
    }
    public Optional<Movie> SingleMovie(String imdbId){
        return MovieRepository.findMovieByimdbId(imdbId);
    }

}



