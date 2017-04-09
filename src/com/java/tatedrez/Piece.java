package com.java.tatedrez;

public abstract class Piece {
	
	abstract public String getName();
	
	abstract public void movePiece(Square casilla);
	
	abstract public void setPositionPiece(String position);
	
	abstract public String getPositionPiece();
	
	abstract public boolean positionValidForThePiece(String casillaActual,String casillaFinal);
		

}
