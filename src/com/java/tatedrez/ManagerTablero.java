package com.java.tatedrez;

public class ManagerTablero {
	
	public void ponerPiezaEnCasilla(Pieza pieza, Casilla casilla){
		casilla.setPieza(pieza);
	}
	
	
	public String casillaCualEsTuPieza(Casilla casilla){
		if(casilla.getPieza()==null){
			return "casilla vacia";
		}
		return casilla.getPieza().getNombre();
	}

}
