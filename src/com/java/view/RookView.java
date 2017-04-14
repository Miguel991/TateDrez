package com.java.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * @author HMC Software Development
 *
 */
public class RookView extends JPanel implements MouseListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7324898131582648993L;
	private String name = "";
	private Image  imagenRook;
	private boolean rookSelect = false;
	private Point point;
	private Rectangle rectangle;
	private ArrayList<RookView> listRook = new ArrayList<>();
	private ManagerResources manager = ManagerResources.getInstance();
	
	public RookView(int x, int y,String name){
		this.name = name;
		this.point = new Point(x,y);
		imagenRook = manager.getImagenRook();
		rectangle = new Rectangle(this.point,new Dimension(40,70));
		setFocusable(true);
		savePiece(this);
	}

	private void savePiece(RookView rookView) {
		this.listRook.add(rookView);		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//at this point we would have to call the controller
		for(RookView list: listRook){
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
	
	public void deselectedPiece(RookView rook){
		this.rookSelect = false;
		System.out.println("the piece was Deselected: "+rook.getName());
	}
	
	public void selectedPiece(RookView rook){
		this.rookSelect = true;
		System.out.println("The piece was selected: "+rook.getName());
	}
	
	public boolean conditionOfPiece(){
		return this.rookSelect;
	}
	
	private Rectangle getRectangle() {
		return this.rectangle;
	}

	public Point getPoint() {
		return this.point;
	}

	public Image getImagenRook() {
		return this.imagenRook;
	}

	public String getName() {
		return this.name;
	}


	@Override
	public void mousePressed(MouseEvent e){}
	@Override
	public void mouseReleased(MouseEvent e){}
	@Override
	public void mouseEntered(MouseEvent e){}
	@Override
	public void mouseExited(MouseEvent e){}

}
