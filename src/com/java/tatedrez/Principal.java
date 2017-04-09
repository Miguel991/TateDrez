package com.java.tatedrez;

public class Principal {
	

	public static void main(String[] args) {

		Tablero tablero = new Tablero();
		Jugador p1 = new Jugador("Jugador Uno", tablero);
		Jugador p2 = new Jugador("Jugador Dos", tablero);
		
		p1.jugadorPoneFichaPorPrimeraVez(p1.getCaballo(), p1.getCasillaUno(), tablero);
		p1.jugadorMueveFicha(p1.getCaballo(), p1.getCasillaCinco(), tablero);
		p1.jugadorMueveFicha(p1.getCaballo(), p1.getCasillaSeis(), tablero);


		
		
		/*
		p1.jugadorPoneFichaPorPrimeraVez(p1.getTorre(),p1.getCasillaUno().getNombreEnum(),tablero);
		p1.jugadorMueveFicha(p1.getTorre(),p1.getCasillaCinco().getNombreEnum(),tablero);
		p1.jugadorMueveFicha(p1.getTorre(),p1.getCasillaDos().getNombreEnum(),tablero);
		p1.jugadorMueveFicha(p1.getTorre(),p1.getCasillaCuatro().getNombreEnum(),tablero);
		p1.jugadorMueveFicha(p1.getTorre(),p1.getCasillaCinco().getNombreEnum(),tablero);
		p1.jugadorMueveFicha(p1.getTorre(),p1.getCasillaDos().getNombreEnum(),tablero);
		p2.jugadorPoneFichaPorPrimeraVez(p2.getTorre(),p2.getCasillaDos().getNombreEnum(),tablero);
		p1.jugadorMueveFicha(p1.getTorre(), p1.getCasillaUno().getNombreEnum(), tablero);
		*/

		
		

	}

}