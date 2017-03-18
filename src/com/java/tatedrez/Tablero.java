package com.java.tatedrez;

import java.util.ArrayList;

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
	private ArrayList<Casilla> listaCasillas;
	
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
		listaCasillas = new ArrayList<Casilla>(9);
		listaCasillas.add(casillaUno);
		listaCasillas.add(casillaDos);
		listaCasillas.add(casillaTres);
		listaCasillas.add(casillaCuatro);
		listaCasillas.add(casillaCinco);
		listaCasillas.add(casillaSeis);
		listaCasillas.add(casillaSiete);
		listaCasillas.add(casillaOcho);
		listaCasillas.add(casillaNueve);

	}
	
	public ArrayList<Casilla> getArrayCasillas(){
		return listaCasillas;
	}

	public Casilla getCasillaUno() {
		return casillaUno;
	}

	public Casilla getCasillaDos() {
		return casillaDos;
	}

	public Casilla getCasillaTres() {
		return casillaTres;
	}

	public Casilla getCasillaCuatro() {
		return casillaCuatro;
	}

	public Casilla getCasillaCinco() {
		return casillaCinco;
	}

	public Casilla getCasillaSeis() {
		return casillaSeis;
	}

	public Casilla getCasillaSiete() {
		return casillaSiete;
	}

	public Casilla getCasillaOcho() {
		return casillaOcho;
	}

	public Casilla getCasillaNueve() {
		return casillaNueve;
	}

}
