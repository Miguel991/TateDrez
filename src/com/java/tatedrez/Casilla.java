package com.java.tatedrez;

public class Casilla {

	private int nombre;

	private String norte,noreste,este,sureste,sur,suroeste,oeste,noroeste;


	public Casilla(int nombre,String norte, String noreste, String este, String sureste, String sur, String suroeste, String oeste, String noroeste) {
		this.nombre = nombre;
		this.norte = norte;
		this.noreste = noreste;
		this.este = este;
		this.sureste = sureste;
		this.sur = sur;
		this.suroeste = suroeste;
		this.oeste = oeste;
		this.noroeste = noroeste;
		
		
	}

	public int getNombreCasilla() {
		return this.nombre;
	}

	private void setDireccion(String direccion) {
		switch (direccion) {
		case "norte":
			this.norte = "norte";
			break;
		case "noreste":
			this.noreste = "noreste";
			break;
		case "este":
			this.este = "este";
			break;
		case "sureste":
			this.sureste = "sureste";
			break;
		case "sur":
			this.sur = "sur";
			break;
		case "suroeste":
			this.suroeste = "suroeste";
			break;
		case "oeste":
			this.oeste = "oeste";
			break;
		case "noroeste":
			this.noroeste = "noroeste";
			break;
		default:

			break;

		}

	}

}
