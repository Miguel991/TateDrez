package com.java.view;

import javax.swing.JFrame;

public class RunApp extends JFrame{
	
	private final int width = 500;
	private final int height = 500;
	
	public RunApp(){
		setTitle("Tatedrez VideoGame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
		
		add(new ChessboardView());
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new RunApp();
	}

}
