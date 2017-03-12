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
	public boolean moverFicha() {
		// TODO Auto-generated method stub
		return true;
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

}
