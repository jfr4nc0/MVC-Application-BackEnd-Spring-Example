package com.itr.app.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itr.app.entities.Jugador;
import com.itr.app.repositories.JugadorRepository;

@Service
public class JugadorServiceImpl implements JugadorService{
	
	@Autowired
	private JugadorRepository jugadorRepository;
	
	// Guardar operacion
	@Override
	public Jugador addJugador(Jugador jugador) {
		return jugadorRepository.save(jugador);
	}
	
	// Leer operacion
	@Override
	public List<Jugador> getJugadorList(){
		return (List<Jugador>) jugadorRepository.findAll();
	}
	
	// Actualizar operacion
	@Override
	public Jugador updateJugador(Jugador jugador, int jugadorId) {
		Jugador jugadorDB = jugadorRepository.findById(jugadorId).get();
		
		if (Objects.nonNull(jugador.getNombre()) && !"".equalsIgnoreCase(jugador.getNombre())) {
            jugadorDB.setNombre(jugador.getNombre());
        }
  
        if (Objects.nonNull(jugador.getApellido()) && !"".equalsIgnoreCase(jugador.getApellido())) {
            jugadorDB.setApellido(jugador.getApellido());
        }
  
        if (Objects.nonNull(jugador.getEdad())) {
            jugadorDB.setEdad(jugador.getEdad());
        }
  
        if (Objects.nonNull(jugador.getEquipo()) && !"".equalsIgnoreCase(jugador.getEquipo())) {
            jugadorDB.setEquipo(jugador.getEquipo());
        }
        
        if (Objects.nonNull(jugador.getPosicion())) {
            jugadorDB.setPosicion(jugador.getPosicion());
        }
        
        if (Objects.nonNull(jugador.getCamiseta())) {
            jugadorDB.setCamiseta(jugador.getCamiseta());
        }
        
        return jugadorRepository.save(jugadorDB);
	}
	
	// Eliminar operacion
	@Override
	public void deleteJugadorById(int jugadorId) {
		jugadorRepository.deleteById(jugadorId);
	}
}
