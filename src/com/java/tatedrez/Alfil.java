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

}
