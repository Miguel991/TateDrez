package com.java.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class RookView extends JPanel implements MouseListener{
	
	private String name = "";
	private Image  imagenRook;
	private boolean rookSelect = false;
	private Point point;
	private Rectangle rectangle;
	private ArrayList<RookView> listRook = new ArrayList<>();
	private ManagerResources manager = ManagerResources.getInstance();
	
	public RookView(int x, int y,String name){
		this.point = new Point(x,y);
		imagenRook = manager.getImagenRook();
		rectangle = new Rectangle(this.point,new Dimension(40,70));
		savePiece(this);
	}

	private void savePiece(RookView rookView) {
		this.listRook.add(rookView);		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	public Point getPoint() {
		return this.point;
	}

	public Image getImagenRook() {
		return this.imagenRook;
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}

} //1139-471007

