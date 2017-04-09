package com.java.tatedrez;

public class Square {

	private String name;
	private String north,northeast,east,southeast,south,southwest,west,northwest;
	private Piece piece = null;

	
	
	
	public Square(String name,String north, String northeast, String east, String southeast, String south, String southwest, String west, String northwest) {
		this.name = name;
		this.north = north;
		this.northeast = northeast;
		this.east = east;
		this.southeast = southeast;
		this.south = south;
		this.southwest = southwest;
		this.west = west;
		this.northwest = northwest;
	}
	
	
	
	

	public String getNameSquare() {
		return this.name;
	}
	
	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}


}
