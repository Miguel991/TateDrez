package com.java.tatedrez;

public enum PosicionesEnum {
	
	CASILLAUNO("1",1),
	CASILLADOS("2",2),
	CASILLATRES("3",3),
	CASILLACUATRO("4",4),
	CASILLACINCO("5",5),
	CASILLASEIS("6",6),
	CASILLASIETE("7",7),
	CASILLAOCHO("8",8),
	CASILLANUEVE("9",9);
	
	private String nombre;
	private int posicion;
	
	
	
	private PosicionesEnum(String a,int b){
		this.nombre = a;
		this.posicion = b;
	}
	public String getNombreEnum(){
		return this.nombre;
	}
	public int getPosicionEnum(){
		return this.posicion;
	}

}
