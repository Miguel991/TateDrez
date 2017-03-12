package com.java.tatedrez;

public class ManagerTablero {
	
	private Pieza pieza;
	private Casilla casilla;
	
	public void ponerPiezaEnCasilla(Pieza pieza, Casilla casilla){
		casilla.setPieza(pieza);
		pieza.setPosicionFicha(casilla.getNombreCasilla()); 
	}
	
	public void moverPieza(Pieza pieza, Casilla casilla){
		
		pieza.moverFicha();
		
	}
	
	
	public String casillaCualEsTuPieza(Casilla casilla){
		if(casilla.getPieza()==null){
			return "casilla vacia";
		}
		return casilla.getPieza().getNombre();
	}
	
	public int contar(){
		return 1,8;
	}

}
