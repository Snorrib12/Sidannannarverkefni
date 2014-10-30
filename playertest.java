package Sidannarverkefni;

import static org.junit.Assert.*;

import org.junit.Test;

public class playertest {

	@Test
	public void setsymboltest() {
		player testplayer = new player("x");
		testplayer.setSymbol("y");
		assertTrue("symbol was changed", "y" == testplayer.symbol);
	}
	@Test
	public void addScoretest(){
		player testplayer = new player("x");
		assertEquals("score is 0", testplayer.score ,0);
		testplayer.addScore();
		assertEquals("score is now 1", testplayer.score , 1);
		testplayer.addScore();
		assertEquals("score is now 2", testplayer.score ,2);
	}

}
