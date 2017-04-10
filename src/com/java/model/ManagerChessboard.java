package com.java.model;

public class ManagerChessboard {

	private Piece piece;
	private Square square;
	private Chessboard chessboard;

	/*
	 * Este metodo solo se llama para poner la pieza por primera vez en el
	 * tablero
	 */
	public void putPieceInSquare(Piece piece, String nameSquare, Chessboard chessboard) {
		for (Square square : chessboard.getArraySquares()) {

			if (square.getNameSquare() == nameSquare) {
				if (areYouFreeSquare(square)) {
					square.setPiece(piece);
					piece.setPositionPiece(square.getNameSquare());
					System.out.println(
							"se coloco la pieza " + piece.getName() + " en la casilla " + square.getNameSquare()+" por primera vez");

				} else {
					System.out.println("la casilla numero: " + square.getNameSquare()
							+ " esta ocupada con una pieza de  " + square.getPiece().getName());

				}

			}
		}
	}

	// Poner una pieza en una casilla
	public void movePiece(Piece piece, String nameSquare, Chessboard chessboard) {
		// En este metodo el manager tiene que preguntar:
		// Primero si la casilla esta libre
        String lastPositionSquare = piece.getPositionPiece();

		for (Square square : chessboard.getArraySquares()) {
			
			if (square.getNameSquare() == nameSquare) {
				
				if (areYouFreeSquare(square) && canThePieceBeMovedToThatSquare(piece,square)) {

					square.setPiece(piece);
					piece.setPositionPiece(square.getNameSquare());
					System.out.println(
							"se coloco la pieza " + piece.getName() + " en la casilla " + square.getNameSquare());
					cleanTheSquare(lastPositionSquare, chessboard);


					// pieza.moverFicha(casilla);

				} else {

					System.out.println("La pieza "+ piece.getName() +" no se puede mover a la casilla N° "+ square.getNameSquare());

				}
				// segundo si el movimiento que quiere hacer la pieza es posible
				// para
				// esa pieza

				// tercero hacer el movimiento de la pieza a la casilla
				// correspondiente
			}
		}
	}

	private boolean canThePieceBeMovedToThatSquare(Piece piece,Square square) {
		//posicion donde se encuentra la ficha actualmente----Posicion hacia donde quiere moverse la ficha
		if(piece.positionValidForThePiece(piece.getPositionPiece(),square.getNameSquare())){ //si la posicion es valida para la pieza entonces devuelve true si no false
			
			return true;
			
		}else {return false;}
	}

	private boolean areYouFreeSquare(Square square) {
		if (square.getPiece() == null) {
			return true;
		} else {
			return false;
		}
	}
	
	private void cleanTheSquare(String nameSquare, Chessboard chessboard){
		
		for(Square square: chessboard.getArraySquares()){
			
			if(square.getNameSquare() == nameSquare){
				square.setPiece(null);
				System.out.println("La casilla " + square.getNameSquare() + " se vacio");
				System.out.println("la casilla "+square.getNameSquare()+" posee la pieza :"+ square.getPiece());
			}
			
		}
		
	}
	
	

}
