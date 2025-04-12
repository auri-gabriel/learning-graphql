package com.aurigabriel.learning_graphql.service;

import com.aurigabriel.learning_graphql.model.Movie;
import com.aurigabriel.learning_graphql.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> getAll() {
        return repository.findAll();
    }

    public Movie getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Movie save(Movie movie) {
        return repository.save(movie);
    }
}
