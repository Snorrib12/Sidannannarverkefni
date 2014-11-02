package Sidannarverkefni;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void Testinput() {
		Board testBoard = new Board();
		assertEquals("place 0 is null", testBoard.board(0) , null);
		testBoard.inputSymbol("x", 0);
		assertEquals("place 0 has x", testBoard.board(0) , "x");
		
	}
	@Test
	public void isValidTest(){
		Board testBoard = new Board();
		assertFalse("input in place 10 is invalid",testBoard.isValid(10));
		assertTrue("input on place 1 is valid",testBoard.isValid(1));
		testBoard.inputSymbol("x", 1);
		assertFalse("input on place 1 is now invalid",testBoard.isValid(1));
	}
	@Test
	public void WinTest(){
		Board testBoard1 = new Board();
		testBoard1.inputSymbol("x", 0);
		testBoard1.inputSymbol("x", 3);
		testBoard1.inputSymbol("x", 6);
		assertEquals("winning conditon satisfied", testBoard1.Win() , "x");

		Board testBoard2 = new Board();
		testBoard2.inputSymbol("x", 0);
		testBoard2.inputSymbol("x", 1);
		testBoard2.inputSymbol("x", 2);
		assertEquals("winning conditon satisfied", testBoard2.Win() , "x");

		Board testBoard3 = new Board();
		testBoard3.inputSymbol("x", 0);
		testBoard3.inputSymbol("x", 4);
		testBoard3.inputSymbol("x", 8);
		assertEquals("winning conditon satisfied", testBoard3.Win() , "x");
		
		Board testBoard4 = new Board();
		testBoard4.inputSymbol("x", 2);
		testBoard4.inputSymbol("x", 4);
		testBoard4.inputSymbol("x", 6);
		assertEquals("winning conditon satisfied", testBoard4.Win() , "x");
	}
	@Test
	public void intergrateTest(){
		Board testBoard = new Board();
		assertEquals("winning condition not satisfied", testBoard.board(0) , null);
		testBoard.inputSymbol("x", 0);
		testBoard.inputSymbol("x", 1);
		testBoard.inputSymbol("x", 2);
		assertEquals("winning conditon satisfied", testBoard.Win() , "x");
	}

}
