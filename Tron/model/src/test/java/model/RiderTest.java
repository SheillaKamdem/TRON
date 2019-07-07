package model;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Before;
import org.junit.Test;



public class RiderTest {

	private tron tron;
	private Direction directiontest = Direction.NORD;
	
	private Grid grid;
	 /**
	 * Set up the test configuration.
	 * 
	 * @throws Exception
	 * 			Signals that an exception has occurred
	 */
	@Before
	public void setUp() throws Exception {
		tron = new tron(100, 200, Color.red, directiontest, grid);
		}
	/**
	 * Test pour tourner à droite
	 */
	@Test
	public void testTurnRight() {
		tron.turnRight();
		assertEquals(Direction.EST,tron.direction);
	}

	/**
	 * Test pour tourner à gauche
	 */
	
	@Test
	public void testTurnLeft() {
		tron.turnLeft();
		assertEquals(Direction.OUEST,tron.direction);
	}
}
