package com.java.view;

import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;


public class PieceListener extends JPanel implements MouseListener {
	
	protected String name;
	protected Point point;
	protected Image imagenPiece;
	protected boolean selectedPiece = false;
	protected Rectangle rectangle;
	protected ArrayList<PieceListener> listPieces = new ArrayList<>();
	protected ManagerResources manager = ManagerResources.getInstance();
	
	public PieceListener(){}
	
	protected void savePieceInList(PieceListener piece){
		this.listPieces.add(piece);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//at this point we would have to call the controller
		for(PieceListener list: listPieces){
			if(list.getRectangle().contains(e.getPoint())){
				System.out.println("******************************************");
				System.out.println("You choice the piece: "+ list.getName());
				if(list.conditionOfPiece() == false){
					list.selectedPiece(list);
				}else{
					list.deselectedPiece(list);
				}
			}
		}
		
	}
	
	private void deselectedPiece(PieceListener p){
		this.selectedPiece = false;
		System.out.println("The piece was deselected: "+ p.getPieceName());
	}
	
	private void selectedPiece(PieceListener p){
		this.selectedPiece = true;
		System.out.println("The piece was selected: "+ p.getPieceName());
	}
	
	private boolean conditionOfPiece(){
		return this.selectedPiece;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Image getImagenPiece() {
		return imagenPiece;
	}

	public void setImagenPiece(Image imagenPiece) {
		this.imagenPiece = imagenPiece;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	
	

}
