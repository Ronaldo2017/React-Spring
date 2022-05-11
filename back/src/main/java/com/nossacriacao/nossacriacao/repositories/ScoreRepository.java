package com.nossacriacao.nossacriacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nossacriacao.nossacriacao.entities.Score;
import com.nossacriacao.nossacriacao.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
