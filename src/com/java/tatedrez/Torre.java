package com.java.tatedrez;

public class Torre extends Pieza{
	
	private String posicion;
	private String nombre = "torre";

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void moverFicha(Casilla casilla) {
		casilla.setPieza(this);
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

	
	private String posicionesPosibles(String posicion) {
		if(posicion == "1" ){}
				return "0";
	}

}
