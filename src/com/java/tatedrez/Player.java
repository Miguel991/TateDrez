package com.java.tatedrez;

public class Player {
	private ManagerChessboard m;
	private String nombre;
	private Rook torre;
	private Bishop alfil;
	private Knight caballo;
	private Chessboard tablero;
	private PositionEnum casillaUno;
	private PositionEnum casillaDos;
	private PositionEnum casillaTres;
	private PositionEnum casillaCuatro;
	private PositionEnum casillaCinco;
	private PositionEnum casillaSeis;
	private PositionEnum casillaSiete;
	private PositionEnum casillaOcho;
	private PositionEnum casillaNueve;
	
	
	public Player(String nombre,Chessboard tablero){
		this.tablero = tablero;
		this.nombre = nombre;
		this.torre = new Rook();
		this.alfil = new Bishop();
		this.caballo = new Knight();
		this.m = new ManagerChessboard();
		this.casillaUno = PositionEnum.CASILLAUNO;
		this.casillaDos = PositionEnum.CASILLADOS;
		this.casillaTres = PositionEnum.CASILLATRES;
		this.casillaCuatro = PositionEnum.CASILLACUATRO;
		this.casillaCinco = PositionEnum.CASILLACINCO;
		this.casillaSeis = PositionEnum.CASILLASEIS;
		this.casillaSiete = PositionEnum.CASILLASIETE;
		this.casillaOcho = PositionEnum.CASILLAOCHO;
		this.casillaNueve = PositionEnum.CASILLANUEVE;
		
		
	}
	//Modificacion para acortar el codigo en el main
	public String getCasillaUno() {
		return casillaUno.getNameEnum();
	}
	
	public String getCasillaDos() {
		return casillaDos.getNameEnum();
	}

	public String getCasillaTres() {
		return casillaTres.getNameEnum();
	}

	public String getCasillaCuatro() {
		return casillaCuatro.getNameEnum();
	}

	public String getCasillaCinco() {
		return casillaCinco.getNameEnum();
	}

	public String getCasillaSeis() {
		return casillaSeis.getNameEnum();
	}

	public String getCasillaSiete() {
		return casillaSiete.getNameEnum();
	}

	public String getCasillaOcho() {
		return casillaOcho.getNameEnum();
	}

	public String getCasillaNueve() {
		return casillaNueve.getNameEnum();
	}


	public void jugadorPoneFichaPorPrimeraVez(Piece pieza, String casilla,Chessboard tablero){
		m.putPieceInSquare(pieza, casilla, tablero);
	}
	
	public void jugadorMueveFicha(Piece pieza, String nombreCasilla, Chessboard tablero){
		m.movePiece(pieza, nombreCasilla,tablero);
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
	
	
	public void setTablero(Chessboard tablero){
		//this.tablero = tablero;
	}
	public Chessboard getTablero(){
		
		return this.tablero;
	}

}
