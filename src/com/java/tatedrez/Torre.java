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
	public boolean moverFicha() {
		
				
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

	
	private int[] posicionesPosibles() {
		// TODO Auto-generated method stub
		return null;
	}

}
