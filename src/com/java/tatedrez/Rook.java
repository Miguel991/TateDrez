package com.java.tatedrez;

public class Rook extends Piece{
	
	private String position;
	private String name = "rook";

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void movePiece(Square square) {
		square.setPiece(this);
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
				//casillas validas 2,3,4,7
				if(destinationPlace=="2" || destinationPlace=="3"|| destinationPlace == "4" || destinationPlace =="7"){
					return true;
				}else{return false;}
			case "2":
				//casillas validas 1,3,5,8
				if(destinationPlace=="1" || destinationPlace=="3"|| destinationPlace == "5" || destinationPlace =="8"){
					return true;
				}else{return false;}
			
			case "3":
				//casillas validas 1,2,6,9
				if(destinationPlace=="1" || destinationPlace=="2"|| destinationPlace == "6" || destinationPlace =="9"){
					return true;
				}else{return false;}
				
			case "4":
				//casillas validas 1,7,5,6
				if(destinationPlace=="1" || destinationPlace=="5"|| destinationPlace == "6" || destinationPlace =="7"){
					return true;
				}else{return false;}
				
			case "5":
				//casilla validas 2,4,6,8
				if(destinationPlace=="2" || destinationPlace=="4"|| destinationPlace == "6" || destinationPlace =="8"){
					return true;
				}else{return false;}
				
			case "6":
				//casillas validas 3,4,5,9
				if(destinationPlace=="3" || destinationPlace=="4"|| destinationPlace == "5" || destinationPlace =="9"){
					return true;
				}else{return false;}
			
			case "7":
				//casillas validas 1,4,8,9
				if(destinationPlace=="1" || destinationPlace=="4"|| destinationPlace == "8" || destinationPlace =="9"){
					return true;
				}else{return false;}
				
			case "8":
				//casillas validas 2,5,7,9
				if(destinationPlace=="2" || destinationPlace=="5"|| destinationPlace == "7" || destinationPlace =="9"){
					return true;
				}else{return false;}
				
			case "9":
				//casillas validas 3,6,7,8
				if(destinationPlace=="3" || destinationPlace=="6"|| destinationPlace == "7" || destinationPlace =="8"){
					return true;
				}else{return false;}
				
		}
		return false;
	}

}
