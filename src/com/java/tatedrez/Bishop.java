package com.java.tatedrez;

public class Bishop extends Piece {
	private String position;
	private String name = "bishop";

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void movePiece(Square square) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setPositionPiece(String position) {
		// TODO Auto-generated method stub
		this.position = position;
	}

	@Override
	public String getPositionPiece() {
		// TODO Auto-generated method stub
		return this.position;
	}
	@Override
	public boolean positionValidForThePiece(String currentSquare,String destinationPlace) {
		switch(currentSquare){
			case "1":
				//casillas validas 5,9
				if(destinationPlace=="5" || destinationPlace=="9"){
					return true;
				}else{return false;}
				
			case "2":
				//casillas validas 4,6
				if(destinationPlace=="4" || destinationPlace=="6"){
					return true;
				}else{return false;}
				
			case "3":
				//casillas validas 5,7
				if(destinationPlace=="5" || destinationPlace=="7"){
					return true;
				}else{return false;}
				
			case "4":
				//casillas validas 2,8
				if(destinationPlace=="2" || destinationPlace=="8"){
					return true;
				}else{return false;}
				
			case "5":
				//casilla validas 1,3,7,9
				if(destinationPlace=="1" || destinationPlace=="3"||destinationPlace == "7"||destinationPlace=="9"){
					return true;
				}else{return false;}
				
			case "6":
				//casillas validas 2,8
				if(destinationPlace=="2" || destinationPlace=="8"){
					return true;
				}else{return false;}
				
			case "7":
				//casillas validas 3,5
				if(destinationPlace=="3" || destinationPlace=="5"){
					return true;
				}else{return false;}
				
			case "8":
				//casillas validas 4,6
				if(destinationPlace=="4" || destinationPlace=="6"){
					return true;
				}else{return false;}
				
			case "9":
				//casillas validas 1,5
				if(destinationPlace=="1" || destinationPlace=="5"){
					return true;
				}else{return false;}
				
		}
		return false;
	}

}
