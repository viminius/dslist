package com.pessoal.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
