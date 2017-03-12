package com.java.tatedrez;

public class Tablero {
	
	private Casilla casillaUno;
	private Casilla casillaDos;
	private Casilla casillaTres;
	private Casilla casillaCuatro;
	private Casilla casillaCinco;
	private Casilla casillaSeis;
	private Casilla casillaSiete;
	private Casilla casillaOcho;
	private Casilla casillaNueve;
	
	public Tablero(){
	//norte,noreste,este,sureste,sur,suroeste,oeste,noroeste
		
		this.casillaUno = new Casilla("1",null,null,"este","sureste","sur",null,null,null);
		this.casillaDos = new Casilla("2",null,null,"este","sureste","sur","suroeste","oeste",null);
		this.casillaTres = new Casilla("3",null,null,null,null,"sur","suroeste","oeste",null);
		this.casillaCuatro = new Casilla("4","norte","noreste","este","sureste","sur",null,null,null);
		this.casillaCinco = new Casilla("5","norte","noreste","este","sureste","sur","suroeste","oeste","noroeste");
		this.casillaSeis = new Casilla("6","norte",null,null,null,"sur","suroeste","oeste","noroeste");
		this.casillaSiete = new Casilla("7","norte","noreste","este",null,null,null,null,null);
		this.casillaOcho = new Casilla("8","norte","noreste","este",null,null,null,"oeste","noroeste");
		this.casillaNueve = new Casilla("9","norte",null,null,null,null,null,"oeste","noroeste");
		
	}

}
