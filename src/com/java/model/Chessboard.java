package com.java.model;

import java.util.ArrayList;

public class Chessboard {
	
	private Square squareOne;
	private Square squareTwo;
	private Square squareThree;
	private Square squareFour;
	private Square squareFive;
	private Square squareSix;
	private Square squareSeven;
	private Square squareEight;
	private Square squareNine;
	private ArrayList<Square> listSquare;
	
	public Chessboard(){
	//norte,noreste,este,sureste,sur,suroeste,oeste,noroeste
		
		this.squareOne = new Square("1",null,null,"east","southeast","south",null,null,null);
		this.squareTwo = new Square("2",null,null,"east","southeast","south","southwest","west",null);
		this.squareThree = new Square("3",null,null,null,null,"south","southwest","west",null);
		this.squareFour = new Square("4","north","northeast","east","southeast","south",null,null,null);
		this.squareFive = new Square("5","north","northeast","east","southeast","south","southwest","west","northwest");
		this.squareSix = new Square("6","north",null,null,null,"south","southwest","west","northwest");
		this.squareSeven = new Square("7","north","northeast","east",null,null,null,null,null);
		this.squareEight = new Square("8","north","northeast","east",null,null,null,"west","northwest");
		this.squareNine = new Square("9","north",null,null,null,null,null,"west","northwest");
		listSquare = new ArrayList<Square>(9);
		listSquare.add(squareOne);
		listSquare.add(squareTwo);
		listSquare.add(squareThree);
		listSquare.add(squareFour);
		listSquare.add(squareFive);
		listSquare.add(squareSix);
		listSquare.add(squareSeven);
		listSquare.add(squareEight);
		listSquare.add(squareNine);

	}
	
	public ArrayList<Square> getArraySquares(){
		return listSquare;
	}

	public Square getSquareOne() {
		return squareOne;
	}

	public Square getSquareTwo() {
		return squareTwo;
	}

	public Square getSquareThree() {
		return squareThree;
	}

	public Square getSquareFour() {
		return squareFour;
	}

	public Square getSquareFive() {
		return squareFive;
	}

	public Square getSquareSix() {
		return squareSix;
	}

	public Square getSquareSeven() {
		return squareSeven;
	}

	public Square getSquareEight() {
		return squareEight;
	}

	public Square getSquareNine() {
		return squareNine;
	}

}
