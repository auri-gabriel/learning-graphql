package com.aurigabriel.learning_graphql.repository;

import com.aurigabriel.learning_graphql.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}