package com.java.tatedrez;

public abstract class Pieza {
	
	abstract public String getNombre();
	
	abstract public void moverFicha(Casilla casilla);
	
	abstract public void setPosicionFicha(String posicion);
	
	abstract public String getPosicionFicha();
	
	abstract public boolean posicionValidaPieza(String casillaActual,String casillaFinal);
		

}
