package com.java.tatedrez;

public class Caballo extends Pieza {
	
	private String posicion;
	private String nombre = "caballo";

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
	public boolean posicionValidaPieza(String casillaActual, String casillaFinal) {
		switch(casillaActual){
			case "1":
				//casillas validas 6,8
				
			case "2":
				//casillas validas 7,9
				
			case "3":
				//casillas validas 4,8
				
			case "4":
				//casillas validas 3,9
				
			case "5":
				//No hay movimientos validos
				return false;
			case "6":
				//casillas validas 1,7
				
			case "7":
				//casillas validas 2,6
				
			case "8":
				//casillas validas 1,3
				
			case "9":
				//casillas validas 2,4
				
		}
		return false;
	}

}
