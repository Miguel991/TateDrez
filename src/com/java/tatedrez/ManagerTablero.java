package com.java.tatedrez;

public class ManagerTablero {

	private Pieza pieza;
	private Casilla casilla;
	private Tablero tablero;

	/*
	 * Este metodo solo se llama para poner la pieza por primera vez en el
	 * tablero
	 */
	public void ponerPiezaEnCasilla(Pieza pieza, String nombreCasilla, Tablero tablero) {
		for (Casilla casilla : tablero.getArrayCasillas()) {

			if (casilla.getNombreCasilla() == nombreCasilla) {
				if (casillaEstasLibre(casilla)) {
					casilla.setPieza(pieza);
					pieza.setPosicionFicha(casilla.getNombreCasilla());
					System.out.println(
							"se coloco la pieza " + pieza.getNombre() + " en la casilla " + casilla.getNombreCasilla()+" por primera vez");

				} else {
					System.out.println("la casilla numero: " + casilla.getNombreCasilla()
							+ " esta ocupada con una pieza de  " + casilla.getPieza().getNombre());

				}

			}
		}
	}

	// Poner una pieza en una casilla
	public void moverPieza(Pieza pieza, String nombreCasilla, Tablero tablero) {
		// En este metodo el manager tiene que preguntar:
		// Primero si la casilla esta libre
        String ultimaPosicionCasilla = pieza.getPosicionFicha();

		for (Casilla casilla : tablero.getArrayCasillas()) {
			
			if (casilla.getNombreCasilla() == nombreCasilla) {
				
				if (casillaEstasLibre(casilla) && laPiezaSePuedeMoverAEstaCasilla(pieza,casilla)) {

					casilla.setPieza(pieza);
					pieza.setPosicionFicha(casilla.getNombreCasilla());
					System.out.println(
							"se coloco la pieza " + pieza.getNombre() + " en la casilla " + casilla.getNombreCasilla());
					vaciarCasilla(ultimaPosicionCasilla, tablero);


					// pieza.moverFicha(casilla);

				} else {

					System.out.println("La pieza "+ pieza.getNombre() +" no se puede mover a la casilla N° "+ casilla.getNombreCasilla());

				}
				// segundo si el movimiento que quiere hacer la pieza es posible
				// para
				// esa pieza

				// tercero hacer el movimiento de la pieza a la casilla
				// correspondiente
			}
		}
	}

	private boolean laPiezaSePuedeMoverAEstaCasilla(Pieza pieza,Casilla casilla) {
		//posicion donde se encuentra la ficha actualmente----Posicion hacia donde quiere moverse la ficha
		if(pieza.posicionValidaPieza(pieza.getPosicionFicha(),casilla.getNombreCasilla())){ //si la posicion es valida para la pieza entonces devuelve true si no false
			
			return true;
			
		}else {return false;}
	}

	private boolean casillaEstasLibre(Casilla casilla) {
		if (casilla.getPieza() == null) {
			return true;
		} else {
			return false;
		}
	}
	
	private void vaciarCasilla(String nombreCasilla, Tablero tablero){
		
		for(Casilla casilla: tablero.getArrayCasillas()){
			
			if(casilla.getNombreCasilla() == nombreCasilla){
				casilla.setPieza(null);
				System.out.println("La casilla " + casilla.getNombreCasilla() + " se vacio");
				System.out.println("la casilla "+casilla.getNombreCasilla()+" posee la pieza :"+ casilla.getPieza());
			}
			
		}
		
	}
	
	

}
