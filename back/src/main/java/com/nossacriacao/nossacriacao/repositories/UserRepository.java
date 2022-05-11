package com.nossacriacao.nossacriacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nossacriacao.nossacriacao.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	//findByEmail = padrao utilizar o nome do campo para fazer a busca no bd
	User findByEmail(String email);
}
