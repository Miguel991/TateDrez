package com.java.tatedrez;

public class Alfil extends Pieza {
	private String posicion;
	private String nombre = "alfil";

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void moverFicha(Casilla casilla) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setPosicionFicha(String posicion) {
		// TODO Auto-generated method stub
		this.posicion = posicion;
	}

	@Override
	public String getPosicionFicha() {
		// TODO Auto-generated method stub
		return this.posicion;
	}
	@Override
	public boolean posicionValidaPieza(String casillaActual,String casillaFinal) {
		switch(casillaActual){
			case "1":
				//casillas validas 5,9
				//fijarse si la casilla a la que se quiere mover la ficha esta dentro las posibilidades desde la posicione 
				//en que se encuentra la ficha 
			case "2":
				//casillas validas 4,6
				
			case "3":
				//casillas validas 5,7
				
			case "4":
				//casillas validas 2,8
				
			case "5":
				//casilla validas 1,3,7,9
				
			case "6":
				//casillas validas 2,8
				
			case "7":
				//casillas validas 3,5
				
			case "8":
				//casillas validas 4,6
				
			case "9":
				//casillas validas 1,5
				
		}
		return false;
	}

}
