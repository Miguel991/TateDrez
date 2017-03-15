package com.java.tatedrez;

public class ManagerTablero {
	
	private Pieza pieza;
	private Casilla casilla;
	
	/*Este metodo solo se llama para poner la pieza por primera vez en el tablero*/
	public void ponerPiezaEnCasilla(Pieza pieza, Casilla casilla){
		casilla.setPieza(pieza);
		pieza.setPosicionFicha(casilla.getNombreCasilla()); 
	}
	
	//Poner un pieza en una casilla 
	public void moverPieza(Pieza pieza, Casilla casilla){
		// En este metodo el manager tiene que preguntar:
		//Primero si la casilla esta libre
		if (casillaEstasLibre(casilla) && movimientoValido(pieza)){
			
			pieza.moverFicha(casilla);

		}else{
			
			System.out.println("La pieza no se puede mover a esa posicion.");
			
		}
		//segundo si el movimiento que quiere hacer la pieza es posible para esa pieza
		
		//tercero hacer el movimiento de la pieza a la casilla correspondiente
		
		
	}
	
	
	private boolean movimientoValido(Pieza pieza2) {
		// TODO Auto-generated method stub
		//FALTA IMPLEMENTAR ESTE METODO PARA LAS PIEZAS
		return false;
	}

	public boolean casillaEstasLibre(Casilla casilla){
		if(casilla.getPieza()==null){
			return true;
		}else{
			return false;
		}
	}

}
