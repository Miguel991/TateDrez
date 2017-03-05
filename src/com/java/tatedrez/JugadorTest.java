package com.java.tatedrez;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JugadorTest {
	
	private Tablero t;
	private Tablero t1;
	private Jugador j;

	@Before
	public void setUp() throws Exception {
		t = new Tablero();
		t1 = new Tablero();
		j = new Jugador("Mario",t);
		
	}

	@Test
	public void siCambiaTablero() {
		j.setTablero(t1);
		assertTrue(j.getTablero()!= t);
	}

}
