package com.itr.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Jugador {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private String equipo;
	private String posicion;
	private int camiseta;
	private String estado;
	
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param equipo
	 * @param posicion
	 * @param camiseta
	 * @param estado
	 */
	
	public Jugador() {}
	
	public Jugador(int id, String nombre, String apellido, int edad, String equipo, String posicion, int camiseta,
			String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.equipo = equipo;
		this.posicion = posicion;
		this.camiseta = camiseta;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(int camiseta) {
		this.camiseta = camiseta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", equipo="
				+ equipo + ", posicion=" + posicion + ", camiseta=" + camiseta + ", estado=" + estado + "]";
	}
}
