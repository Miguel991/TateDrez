package com.java.tatedrez;

public class ManagerTablero {

	private Piece pieza;
	private Square casilla;
	private Tablero tablero;

	/*
	 * Este metodo solo se llama para poner la pieza por primera vez en el
	 * tablero
	 */
	public void ponerPiezaEnCasilla(Piece pieza, String nombreCasilla, Tablero tablero) {
		for (Square casilla : tablero.getArrayCasillas()) {

			if (casilla.getNameSquare() == nombreCasilla) {
				if (casillaEstasLibre(casilla)) {
					casilla.setPiece(pieza);
					pieza.setPositionPiece(casilla.getNameSquare());
					System.out.println(
							"se coloco la pieza " + pieza.getName() + " en la casilla " + casilla.getNameSquare()+" por primera vez");

				} else {
					System.out.println("la casilla numero: " + casilla.getNameSquare()
							+ " esta ocupada con una pieza de  " + casilla.getPiece().getName());

				}

			}
		}
	}

	// Poner una pieza en una casilla
	public void moverPieza(Piece pieza, String nombreCasilla, Tablero tablero) {
		// En este metodo el manager tiene que preguntar:
		// Primero si la casilla esta libre
        String ultimaPosicionCasilla = pieza.getPositionPiece();

		for (Square casilla : tablero.getArrayCasillas()) {
			
			if (casilla.getNameSquare() == nombreCasilla) {
				
				if (casillaEstasLibre(casilla) && laPiezaSePuedeMoverAEstaCasilla(pieza,casilla)) {

					casilla.setPiece(pieza);
					pieza.setPositionPiece(casilla.getNameSquare());
					System.out.println(
							"se coloco la pieza " + pieza.getName() + " en la casilla " + casilla.getNameSquare());
					vaciarCasilla(ultimaPosicionCasilla, tablero);


					// pieza.moverFicha(casilla);

				} else {

					System.out.println("La pieza "+ pieza.getName() +" no se puede mover a la casilla N° "+ casilla.getNameSquare());

				}
				// segundo si el movimiento que quiere hacer la pieza es posible
				// para
				// esa pieza

				// tercero hacer el movimiento de la pieza a la casilla
				// correspondiente
			}
		}
	}

	private boolean laPiezaSePuedeMoverAEstaCasilla(Piece pieza,Square casilla) {
		//posicion donde se encuentra la ficha actualmente----Posicion hacia donde quiere moverse la ficha
		if(pieza.positionValidForThePiece(pieza.getPositionPiece(),casilla.getNameSquare())){ //si la posicion es valida para la pieza entonces devuelve true si no false
			
			return true;
			
		}else {return false;}
	}

	private boolean casillaEstasLibre(Square casilla) {
		if (casilla.getPiece() == null) {
			return true;
		} else {
			return false;
		}
	}
	
	private void vaciarCasilla(String nombreCasilla, Tablero tablero){
		
		for(Square casilla: tablero.getArrayCasillas()){
			
			if(casilla.getNameSquare() == nombreCasilla){
				casilla.setPiece(null);
				System.out.println("La casilla " + casilla.getNameSquare() + " se vacio");
				System.out.println("la casilla "+casilla.getNameSquare()+" posee la pieza :"+ casilla.getPiece());
			}
			
		}
		
	}
	
	

}
