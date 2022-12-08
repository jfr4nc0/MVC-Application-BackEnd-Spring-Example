package com.itr.app.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.itr.app.entities.Jugador;
import com.itr.app.services.JugadorService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JugadorController {
	
	@Autowired
	private JugadorService jugadorService;
	
	// Guardar operacion
    @PostMapping("/jugadores")
    public Jugador addJugador(
        @Valid @RequestBody Jugador jugador)
    {
  
        return jugadorService.addJugador(jugador);
    }
  
    // Read operation
    @GetMapping("/jugadores")
    public List<Jugador> getJugadorList()
    {
  
        return jugadorService.getJugadorList();
    }
  
    // Update operation
    @PutMapping("/jugadores/{id}")
    public Jugador updateJugador(@RequestBody Jugador jugador,
                     @PathVariable("id") int jugadorId)
    {
  
        return jugadorService.updateJugador(
            jugador, jugadorId);
    }
  
    // Delete operation
    @DeleteMapping("/jugadores/{id}")
    public String deleteJugadorById(@PathVariable("id")
                                       int jugadorId)
    {
        jugadorService.deleteJugadorById(
            jugadorId);
        return "Deleted Successfully";
    }
}
