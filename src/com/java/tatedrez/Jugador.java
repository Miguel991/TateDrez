package com.java.tatedrez;

public class Jugador {
	private ManagerTablero m;
	private String nombre;
	private Torre torre;
	private Alfil alfil;
	private Caballo caballo;
	private Tablero tablero;
	private PosicionesEnum casillaUno;
	private PosicionesEnum casillaDos;
	private PosicionesEnum casillaTres;
	private PosicionesEnum casillaCuatro;
	private PosicionesEnum casillaCinco;
	private PosicionesEnum casillaSeis;
	private PosicionesEnum casillaSiete;
	private PosicionesEnum casillaOcho;
	private PosicionesEnum casillaNueve;
	
	
	public Jugador(String nombre,Tablero tablero){
		this.tablero = tablero;
		this.nombre = nombre;
		this.torre = new Torre();
		this.alfil = new Alfil();
		this.caballo = new Caballo();
		this.m = new ManagerTablero();
		this.casillaUno = PosicionesEnum.CASILLAUNO;
		this.casillaDos = PosicionesEnum.CASILLADOS;
		this.casillaTres = PosicionesEnum.CASILLATRES;
		this.casillaCuatro = PosicionesEnum.CASILLACUATRO;
		this.casillaCinco = PosicionesEnum.CASILLACINCO;
		this.casillaSeis = PosicionesEnum.CASILLASEIS;
		this.casillaSiete = PosicionesEnum.CASILLASIETE;
		this.casillaOcho = PosicionesEnum.CASILLAOCHO;
		this.casillaNueve = PosicionesEnum.CASILLANUEVE;
		
		
	}
	
	public PosicionesEnum getCasillaUno() {
		return casillaUno;
	}

	public void jugadorPoneFichaPorPrimeraVez(Pieza pieza, String casilla,Tablero tablero){
		m.ponerPiezaEnCasilla(pieza, casilla, tablero);
	}
	
	public void jugadorMueveFicha(Pieza pieza, String nombreCasilla, Tablero tablero){
		m.moverPieza(pieza, nombreCasilla,tablero);
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
