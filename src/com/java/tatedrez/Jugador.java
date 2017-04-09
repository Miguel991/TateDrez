package com.java.tatedrez;

public class Jugador {
	private ManagerTablero m;
	private String nombre;
	private Torre torre;
	private Bishop alfil;
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
		this.alfil = new Bishop();
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
	//Modificacion para acortar el codigo en el main
	public String getCasillaUno() {
		return casillaUno.getNombreEnum();
	}
	
	public String getCasillaDos() {
		return casillaDos.getNombreEnum();
	}

	public String getCasillaTres() {
		return casillaTres.getNombreEnum();
	}

	public String getCasillaCuatro() {
		return casillaCuatro.getNombreEnum();
	}

	public String getCasillaCinco() {
		return casillaCinco.getNombreEnum();
	}

	public String getCasillaSeis() {
		return casillaSeis.getNombreEnum();
	}

	public String getCasillaSiete() {
		return casillaSiete.getNombreEnum();
	}

	public String getCasillaOcho() {
		return casillaOcho.getNombreEnum();
	}

	public String getCasillaNueve() {
		return casillaNueve.getNombreEnum();
	}


	public void jugadorPoneFichaPorPrimeraVez(Piece pieza, String casilla,Tablero tablero){
		m.ponerPiezaEnCasilla(pieza, casilla, tablero);
	}
	
	public void jugadorMueveFicha(Piece pieza, String nombreCasilla, Tablero tablero){
		m.moverPieza(pieza, nombreCasilla,tablero);
	}
	
	//para acceder a las piezas que tiene el jugador
	public Piece getTorre(){
		return this.torre;
	}
	public Piece getAfil(){
		return this.alfil;
	}
	public Piece getCaballo(){
		return this.caballo;
	}
	
	
	public void setTablero(Tablero tablero){
		//this.tablero = tablero;
	}
	public Tablero getTablero(){
		
		return this.tablero;
	}

}
