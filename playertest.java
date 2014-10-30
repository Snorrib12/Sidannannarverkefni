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

}
