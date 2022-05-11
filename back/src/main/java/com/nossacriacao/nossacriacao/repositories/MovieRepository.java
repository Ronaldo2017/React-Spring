package com.nossacriacao.nossacriacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nossacriacao.nossacriacao.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
