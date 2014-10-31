package Sidannarverkefni;

import static org.junit.Assert.*;

import org.junit.Test;

public class playertest {
	
	
	@Test
	public void setsymboltest() {
		player testplayer = new player("x");
		assertTrue("symbol is x", "x" == testplayer.symbol());
		testplayer.setSymbol("o");
		assertTrue("symbol was changed", "o" == testplayer.symbol());
	}
	@Test
	public void addScoretest(){
		player testplayer = new player("x");
		assertEquals("score is 0", testplayer.score() ,0);
		testplayer.addScore();
		assertEquals("score is now 1", testplayer.score() , 1);
		testplayer.addScore();
		assertEquals("score is now 2", testplayer.score() ,2);
	}
	@Test
	public void winTest(){
		player testplayer = new player("x");
		assertEquals("score is 0",testplayer.score() ,0);
		assertEquals("symbol is x",testplayer.symbol(), "x");
		testplayer.win();
		assertEquals("score is 1",testplayer.score() ,1);
		assertEquals("symbol is y",testplayer.symbol(), "o");
	}
	@Test
	public void loseTest(){
		player testplayer = new player("x");
		assertEquals("score is 0",testplayer.score() ,0);
		assertEquals("symbol is x",testplayer.symbol(), "x");
		testplayer.lose();
		assertEquals("score is 1",testplayer.score() ,0);
		assertEquals("symbol is y",testplayer.symbol(), "o");
	}

}
