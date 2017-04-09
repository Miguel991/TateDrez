package com.java.tatedrez;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
	
	private Chessboard t;
	private Chessboard t1;
	private Player j;

	@Before
	public void setUp() throws Exception {
		t = new Chessboard();
		t1 = new Chessboard();
		j = new Player("Mario",t);
		
	}

	@Test
	public void siCambiaTablero() {
		j.setChessboard(t1);
		assertTrue(j.getChessboard()!= t);
	}

}
