package com.java.tatedrez;

import java.util.ArrayList;

public class Tablero {
	
	private Square casillaUno;
	private Square casillaDos;
	private Square casillaTres;
	private Square casillaCuatro;
	private Square casillaCinco;
	private Square casillaSeis;
	private Square casillaSiete;
	private Square casillaOcho;
	private Square casillaNueve;
	private ArrayList<Square> listaCasillas;
	
	public Tablero(){
	//norte,noreste,este,sureste,sur,suroeste,oeste,noroeste
		
		this.casillaUno = new Square("1",null,null,"este","sureste","sur",null,null,null);
		this.casillaDos = new Square("2",null,null,"este","sureste","sur","suroeste","oeste",null);
		this.casillaTres = new Square("3",null,null,null,null,"sur","suroeste","oeste",null);
		this.casillaCuatro = new Square("4","norte","noreste","este","sureste","sur",null,null,null);
		this.casillaCinco = new Square("5","norte","noreste","este","sureste","sur","suroeste","oeste","noroeste");
		this.casillaSeis = new Square("6","norte",null,null,null,"sur","suroeste","oeste","noroeste");
		this.casillaSiete = new Square("7","norte","noreste","este",null,null,null,null,null);
		this.casillaOcho = new Square("8","norte","noreste","este",null,null,null,"oeste","noroeste");
		this.casillaNueve = new Square("9","norte",null,null,null,null,null,"oeste","noroeste");
		listaCasillas = new ArrayList<Square>(9);
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
	
	public ArrayList<Square> getArrayCasillas(){
		return listaCasillas;
	}

	public Square getCasillaUno() {
		return casillaUno;
	}

	public Square getCasillaDos() {
		return casillaDos;
	}

	public Square getCasillaTres() {
		return casillaTres;
	}

	public Square getCasillaCuatro() {
		return casillaCuatro;
	}

	public Square getCasillaCinco() {
		return casillaCinco;
	}

	public Square getCasillaSeis() {
		return casillaSeis;
	}

	public Square getCasillaSiete() {
		return casillaSiete;
	}

	public Square getCasillaOcho() {
		return casillaOcho;
	}

	public Square getCasillaNueve() {
		return casillaNueve;
	}

}
