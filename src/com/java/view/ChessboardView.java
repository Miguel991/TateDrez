package com.java.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 * @author HMC software Development
 */
public class ChessboardView extends JFrame implements Runnable {
	
	private static final long serialVersionUID = 1L;
	private static final int windowSize = 400;
	private Thread thread;
	private static final int positionBackground = 61;
	private final int SLEEP = 100;
	private ImageIcon wallpaper;
	private ManagerResources sources = ManagerResources.getInstance();
	private RookView rookPlayerOne;
	private RookView rookPlayerTwo;
	
	public ChessboardView(){
		setLayout(null);
		rookPlayerOne = new RookView(80,80,"Rook PlayerOne");
		rookPlayerTwo = new RookView(270,80,"Rook PlayerTwo");
		wallpaper = sources.getImagenBackground();
		addMouseListener(rookPlayerOne);
		addMouseListener(rookPlayerTwo);
		pack();
		setSize(windowSize,windowSize);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		while(true){
			loop();
			repaint();
			try{
				Thread.sleep(SLEEP);
			}catch(InterruptedException err){
				System.out.println(err);
			}
		}		
	}

	public void loop() {
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g.create();
		
		g2.drawImage(wallpaper.getImage(), positionBackground,positionBackground,null);		
		g2.drawImage(rookPlayerOne.getImagenRook(), rookPlayerOne.getPoint().x, rookPlayerOne.getPoint().y,this);
		g2.drawImage(rookPlayerTwo.getImagenRook(), rookPlayerTwo.getPoint().x, rookPlayerTwo.getPoint().y,this);
	
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
