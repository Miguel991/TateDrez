package com.java.tatedrez;

public class TestOfTheModel {
	

	public static void main(String[] args) {

		Chessboard chessboard = new Chessboard();
		Player p1 = new Player("Player One", chessboard);
		Player p2 = new Player("Player Two", chessboard);
		
		p1.playerPutPieceForTheFirstTime(p1.getKnight(), p1.getSquareOne(), chessboard);
		p1.playerMovesPiece(p1.getKnight(), p1.getSquareFive(), chessboard);
		p1.playerMovesPiece(p1.getKnight(), p1.getSquareSix(), chessboard);


		
		
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