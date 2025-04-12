package com.aurigabriel.learning_graphql.controller;

import com.aurigabriel.learning_graphql.model.Movie;
import com.aurigabriel.learning_graphql.service.MovieService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @QueryMapping
    public List<Movie> movies() {
        return service.getAll();
    }

    @QueryMapping
    public Movie movieById(@Argument Long id) {
        return service.getById(id);
    }

    @MutationMapping
    public Movie addMovie(
        @Argument String title,
        @Argument String director,
        @Argument String genre,
        @Argument Integer releaseYear
    ) {
        return service.save(new Movie(null, title, director, genre, releaseYear));
    }
}

