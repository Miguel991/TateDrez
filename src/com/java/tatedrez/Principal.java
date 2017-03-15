package com.java.tatedrez;

public class Principal {

	public static void main(String[] args) {

		Tablero tablero = new Tablero();
		Jugador p1 = new Jugador("Jugador Uno", tablero);
		Jugador p2 = new Jugador("Jugador Dos", tablero);
		p1.jugadorPoneFichaPorPrimeraVez(p1.getTorre(), p1.getTablero().getCasillaUno());
		p1.jugadorMueveFicha(p1.getTorre(), p1.getTablero().getCasillaDos());
		

	}

}