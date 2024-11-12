package com.pessoal.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
