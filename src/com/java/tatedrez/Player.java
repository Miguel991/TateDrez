package com.java.tatedrez;

public class Player {
	private ManagerChessboard manager;
	private String name;
	private Rook rook;
	private Bishop bishop;
	private Knight knight;
	private Chessboard chessboard;
	private PositionEnum squareOne;
	private PositionEnum squareTwo;
	private PositionEnum squareThree;
	private PositionEnum squareFour;
	private PositionEnum squareFive;
	private PositionEnum squareSix;
	private PositionEnum squareSeven;
	private PositionEnum squareEight;
	private PositionEnum squareNine;
	
	
	public Player(String name,Chessboard chessboard){
		this.chessboard = chessboard;
		this.name = name;
		this.rook = new Rook();
		this.bishop = new Bishop();
		this.knight = new Knight();
		this.manager = new ManagerChessboard();
		this.squareOne = PositionEnum.CASILLAUNO;
		this.squareTwo = PositionEnum.CASILLADOS;
		this.squareThree = PositionEnum.CASILLATRES;
		this.squareFour = PositionEnum.CASILLACUATRO;
		this.squareFive = PositionEnum.CASILLACINCO;
		this.squareSix = PositionEnum.CASILLASEIS;
		this.squareSeven = PositionEnum.CASILLASIETE;
		this.squareEight = PositionEnum.CASILLAOCHO;
		this.squareNine = PositionEnum.CASILLANUEVE;
		
		
	}
	//Modificacion para acortar el codigo en el main
	public String getSquareOne() {
		return squareOne.getNameEnum();
	}
	
	public String getSquareTwo() {
		return squareTwo.getNameEnum();
	}

	public String getSquareThree() {
		return squareThree.getNameEnum();
	}

	public String getSquareFour() {
		return squareFour.getNameEnum();
	}

	public String getSquareFive() {
		return squareFive.getNameEnum();
	}

	public String getSquareSix() {
		return squareSix.getNameEnum();
	}

	public String getSquareSeven() {
		return squareSeven.getNameEnum();
	}

	public String getSquareEight() {
		return squareEight.getNameEnum();
	}

	public String getSquareNine() {
		return squareNine.getNameEnum();
	}


	public void playerPutPieceForTheFirstTime(Piece piece, String square,Chessboard chessboard){
		manager.putPieceInSquare(piece, square, chessboard);
	}
	
	public void playerMovesPiece(Piece piece, String nameSquare, Chessboard chessboard){
		manager.movePiece(piece, nameSquare,chessboard);
	}
	
	//para acceder a las piezas que tiene el jugador
	public Piece getRook(){
		return this.rook;
	}
	public Piece getBishop(){
		return this.bishop;
	}
	public Piece getKnight(){
		return this.knight;
	}
	
	
	public void setChessboard(Chessboard chessboard){
		//this.tablero = tablero;
	}
	public Chessboard getChessboard(){
		
		return this.chessboard;
	}

}
