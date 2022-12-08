package com.itr.app.services;

import java.util.List;

import com.itr.app.entities.Jugador;

public interface JugadorService {
    // guardar operacion
    Jugador addJugador(Jugador jugador);
  
    // leer operacion
    List<Jugador> getJugadorList();
  
    // actualizar operacion
    Jugador updateJugador(Jugador jugador, int jugadorId);
  
    // eliminar operacion
    void deleteJugadorById(int jugadorId);
}
