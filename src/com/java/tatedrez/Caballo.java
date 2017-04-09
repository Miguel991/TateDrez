package com.java.tatedrez;

public class Caballo extends Piece {
	
	private String posicion;
	private String nombre = "caballo";

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void movePiece(Square casilla) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setPositionPiece(String posicion) {
		// TODO Auto-generated method stub
		this.posicion = posicion;
		
	}

	@Override
	public String getPositionPiece() {
		// TODO Auto-generated method stub
		return this.posicion;
	}
	
	@Override
	public boolean positionValidForThePiece(String casillaActual, String casillaFinal) {
		switch(casillaActual){
			case "1":
				//casillas validas 6,8
				if(casillaFinal=="6" || casillaFinal=="8"){
					return true;
				}else{return false;}
				
			case "2":
				//casillas validas 7,9
				if(casillaFinal=="7" || casillaFinal=="9"){
					return true;
				}else{return false;}
				
			case "3":
				//casillas validas 4,8
				if(casillaFinal=="4" || casillaFinal=="8"){
					return true;
				}else{return false;}
				
			case "4":
				//casillas validas 3,9
				if(casillaFinal=="3" || casillaFinal=="9"){
					return true;
				}else{return false;}
				
			case "5":
				//No hay movimientos validos
				return false;
			case "6":
				//casillas validas 1,7
				if(casillaFinal=="1" || casillaFinal=="7"){
					return true;
				}else{return false;}
				
			case "7":
				//casillas validas 2,6
				if(casillaFinal=="2" || casillaFinal=="6"){
					return true;
				}else{return false;}
				
			case "8":
				//casillas validas 1,3
				if(casillaFinal=="1" || casillaFinal=="3"){
					return true;
				}else{return false;}
				
			case "9":
				//casillas validas 2,4
				if(casillaFinal=="2" || casillaFinal=="4"){
					return true;
				}else{return false;}
				
		}
		return false;
	}

}
