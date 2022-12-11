package com.itr.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itr.app.entities.Jugador;

@Repository
public interface JugadorRepository extends CrudRepository<Jugador, Integer>{}
