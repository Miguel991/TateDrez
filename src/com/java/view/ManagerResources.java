package com.java.view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * @author HMC Development Software 
 * 
 * Singleton Patterns
 *
 */
public class ManagerResources {
	
	private static final String backgroundBoardPath = "/resources/tablerotatedrez.png";
	private static final String spriteSheetPath = "resources/chess_pieces.png";
	private BufferedImage spriteSheet;
	private int TILE_SIZE = 20;//If the position of each sprite can be multiplied by 2
	private ImageIcon imagenBackground; 
	private Image imagenRook;
	private static ManagerResources manager;
	
	
	private ManagerResources(){
		spriteSheet = loadSprite(spriteSheetPath);
		imagenBackground = new ImageIcon(this.getClass().getResource(backgroundBoardPath));
		imagenRook = getSprite(88, 20);
	}
	
	public static ManagerResources getInstance(){
		if(manager == null){
			manager = new ManagerResources();
			}
		return manager;
			
	}
	
	public BufferedImage loadSprite(String file) {
		BufferedImage sprite = null;
		try {
			sprite = ImageIO.read(new File(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sprite;
	}

	public BufferedImage getSprite(int xGrid, int yGrid) {
		if (spriteSheet == null) {
			spriteSheet = loadSprite("resources/chess_pieces.png");
		}
		return spriteSheet.getSubimage(xGrid , yGrid, 40, 70);
	}
	
	public ImageIcon getImagenBackground() {
		return this.imagenBackground;
	}

	public Image getImagenRook() {
		return this.imagenRook;
	}

}
