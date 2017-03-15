package com.java.tatedrez;

public class Casilla {

	private String nombre;
	private String norte,noreste,este,sureste,sur,suroeste,oeste,noroeste;
	private Pieza pieza = null;

	
	
	
	public Casilla(String nombre,String norte, String noreste, String este, String sureste, String sur, String suroeste, String oeste, String noroeste) {
		this.nombre = nombre;
		this.norte = norte;
		this.noreste = noreste;
		this.este = este;
		this.sureste = sureste;
		this.sur = sur;
		this.suroeste = suroeste;
		this.oeste = oeste;
		this.noroeste = noroeste;
	}
	
	
	
	

	public String getNombreCasilla() {
		return this.nombre;
	}
	
	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}


}
