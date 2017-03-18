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
	public void moverFicha(Casilla casilla) {
		casilla.setPieza(this);
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
				//casillas validas 2,3,4,7
				if(casillaFinal=="2" || casillaFinal=="3"|| casillaFinal == "4" || casillaFinal =="7"){
					return true;
				}else{return false;}
			case "2":
				//casillas validas 1,3,5,8
				if(casillaFinal=="1" || casillaFinal=="3"|| casillaFinal == "5" || casillaFinal =="8"){
					return true;
				}else{return false;}
			
			case "3":
				//casillas validas 1,2,6,9
				break;
			case "4":
				//casillas validas 1,7,5,6
				break;
			case "5":
				//casilla validas 2,4,6,8
				break;
			case "6":
				//casillas validas 3,4,5,9
				break;
			case "7":
				//casillas validas 1,4,8,9
				break;
			case "8":
				//casillas validas 2,5,7,9
				break;
			case "9":
				//casillas validas 3,6,7,8
				break;
		}
		return false;
	}

}
