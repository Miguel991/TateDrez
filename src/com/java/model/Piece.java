package com.java.model;

public abstract class Piece {
	
	abstract public String getName();
	
	abstract public void movePiece(Square square);
	
	abstract public void setPositionPiece(String position);
	
	abstract public String getPositionPiece();
	
	abstract public boolean positionValidForThePiece(String currentSquare,String destinationPlace);
		

}
