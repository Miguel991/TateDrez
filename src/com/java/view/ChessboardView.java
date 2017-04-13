package com.java.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ChessboardView extends JPanel implements Runnable {
	
	private Thread thread;
	private int positionBackgroundX,positionBackgroundY;
	private final int SLEEP = 100;
	private Image wallpaper;
	private final String ImagePathBackground = "/drawable/chess-board.png";
	//private ViewController viewController;
	//private String imagePath = "/drawable/torre.png" ESTO ESTA MAL EL TABLERO NO TIENE PORQUE SABER DE DONDE VIENE LA IMAGEN DE LAS PIEZAS
	//private EnumPositionPiece enum ; Esto esta relativamente bien ya que el tablero puede llegar a conocer las posiciones de las casillas en coordenadas x-y
	//Un manager de tablero no puede conocer a la vista se estaria rompiendo el modelo vista controlador
	
	public ChessboardView(){
		setBackground(Color.DARK_GRAY);
		setDoubleBuffered(true);
		wallpaper = new ImageIcon(this.getClass().getResource(ImagePathBackground)).getImage();
		
		//ahora tendriamos que poner los objetos que se van a inicializar cuando se cree una vista del tablero
		//como por ejemplo las vista de las piezas y otras imagenes
		//inicializar no necesariamente es imprimir en pantallar
		
		//viewController = new ViewController();
		
	}

	@Override
	public void run() {
		while(true){
			loop();
			repaint();
			try{
				Thread.sleep(SLEEP);
			}catch(InterruptedException err){
				System.err.println(err);
			}
		}		
	}

//Actualizar coordenadas para imagenes
	public void loop() {
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		//dibujamos las imagenes que se van a mostrar en el tablero
		g2.drawImage(wallpaper, 12,12,null);//Agregamos la imagen de fondo
		//aca ponemos nuestras imagenes de fichas y actualizamos sus coordenadas conforme el jugador vaya moviendo las fichas
		
		//g2.drawImage(rook.getImage(), rook.getX(), rook.getY(),this); ejemplo para agregar torre
		
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
	}

	@Override
	public void addNotify() {
		super.addNotify();
		
		thread = new Thread(this);
		thread.start();
		
	}
	

}
