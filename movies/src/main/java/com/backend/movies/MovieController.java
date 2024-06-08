package com.backend.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/review/movies")
public class MovieController {
    @Autowired
    private MovieService MovieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(MovieService.AllMovies(), HttpStatus.OK);

    }
    @GetMapping("/{Id}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String Id){
        return new ResponseEntity<Optional<Movie>>(MovieService.SingleMovie(Id), HttpStatus.OK);

    }
}
