package com.java.tatedrez;

public enum PositionEnum {
	
	CASILLAUNO("1",1),
	CASILLADOS("2",2),
	CASILLATRES("3",3),
	CASILLACUATRO("4",4),
	CASILLACINCO("5",5),
	CASILLASEIS("6",6),
	CASILLASIETE("7",7),
	CASILLAOCHO("8",8),
	CASILLANUEVE("9",9);
	
	private String name;
	private int position;
	
	
	
	private PositionEnum(String a,int b){
		this.name = a;
		this.position = b;
	}
	public String getNameEnum(){
		return this.name;
	}
	public int getPositionEnum(){
		return this.position;
	}

}
