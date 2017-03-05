package com.java.tatedrez;

public class Jugador {
	
	private String nombre;
	private Torre torre;
	private Alfil alfil;
	private Caballo caballo;
	private Tablero tablero;
	
	public Jugador(String nombre,Tablero tablero){
		this.tablero = tablero;
		this.nombre = nombre;
		this.torre = new Torre();
		this.alfil = new Alfil();
		this.caballo = new Caballo();
		
	}
	
	
	public void setTablero(Tablero tablero){
		//this.tablero = tablero;
	}
	public Tablero getTablero(){
		
		return this.tablero;
	}

}
