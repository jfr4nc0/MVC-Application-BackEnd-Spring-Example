package com.itr.app.services;

import java.util.List;

import com.itr.app.entities.Jugador;

public interface JugadorService {
    // guardar operacion
    Jugador saveJugador(Jugador jugador);
  
    // leer operacion
    List<Jugador> fetchJugadorList();
  
    // actualizar operacion
    Jugador updateJugador(Jugador jugador, int jugadorId);
  
    // eliminar operacion
    void deleteJugadorById(int jugadorId);
}
