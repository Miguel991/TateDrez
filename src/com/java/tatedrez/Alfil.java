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
	@Override
	public boolean posicionValidaPieza(String casillaActual,String casillaFinal) {
		switch(casillaActual){
			case "1":
				//casillas validas 5,9
				if(casillaFinal=="5" || casillaFinal=="9"){
					return true;
				}else{return false;}
				
			case "2":
				//casillas validas 4,6
				if(casillaFinal=="4" || casillaFinal=="6"){
					return true;
				}else{return false;}
				
			case "3":
				//casillas validas 5,7
				if(casillaFinal=="5" || casillaFinal=="7"){
					return true;
				}else{return false;}
				
			case "4":
				//casillas validas 2,8
				if(casillaFinal=="2" || casillaFinal=="8"){
					return true;
				}else{return false;}
				
			case "5":
				//casilla validas 1,3,7,9
				if(casillaFinal=="1" || casillaFinal=="3"||casillaFinal == "7"||casillaFinal=="9"){
					return true;
				}else{return false;}
				
			case "6":
				//casillas validas 2,8
				if(casillaFinal=="2" || casillaFinal=="8"){
					return true;
				}else{return false;}
				
			case "7":
				//casillas validas 3,5
				if(casillaFinal=="3" || casillaFinal=="5"){
					return true;
				}else{return false;}
				
			case "8":
				//casillas validas 4,6
				if(casillaFinal=="4" || casillaFinal=="6"){
					return true;
				}else{return false;}
				
			case "9":
				//casillas validas 1,5
				if(casillaFinal=="1" || casillaFinal=="5"){
					return true;
				}else{return false;}
				
		}
		return false;
	}

}
