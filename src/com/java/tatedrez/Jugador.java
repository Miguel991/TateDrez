package com.java.tatedrez;

public class Jugador {
	private ManagerTablero m;
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
		this.m = new ManagerTablero();
	}
	
	public void jugadorPoneFichaPorPrimeraVez(Pieza pieza, Casilla casilla){
		m.ponerPiezaEnCasilla(pieza, casilla);
	}
	
	public void jugadorMueveFicha(Pieza pieza, Casilla casilla){
		m.moverPieza(pieza, casilla);
	}
	
	//para acceder a las piezas que tiene el jugador
	public Pieza getTorre(){
		return this.torre;
	}
	public Pieza getAfil(){
		return this.alfil;
	}
	public Pieza getCaballo(){
		return this.caballo;
	}
	
	
	public void setTablero(Tablero tablero){
		//this.tablero = tablero;
	}
	public Tablero getTablero(){
		
		return this.tablero;
	}

}
