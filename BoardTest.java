package Sidannarverkefni;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void Testinput() {
		Board testBoard = new Board();
		assertEquals("place 0 is null", testBoard.board[0] , null);
		testBoard.inputSymbol("x", 0);
		assertEquals("place 0 has x", testBoard.board[0] , "x");
		
	}
	@Test
	public void WinTest(){
		Board testBoard1 = new Board();
		testBoard1.board[0] = "x";
		testBoard1.board[3] = "x";
		testBoard1.board[6] = "x";
		assertEquals("winning conditon satisfied", testBoard1.Win() , "x");

		Board testBoard2 = new Board();
		testBoard2.board[0] = "x";
		testBoard2.board[1] = "x";
		testBoard2.board[2] = "x";
		assertEquals("winning conditon satisfied", testBoard2.Win() , "x");

		Board testBoard3 = new Board();
		testBoard3.board[0] = "x";
		testBoard3.board[4] = "x";
		testBoard3.board[8] = "x";
		assertEquals("winning conditon satisfied", testBoard3.Win() , "x");
		
		Board testBoard4 = new Board();
		testBoard4.board[2] = "x";
		testBoard4.board[4] = "x";
		testBoard4.board[6] = "x";
		assertEquals("winning conditon satisfied", testBoard4.Win() , "x");
	}
	@Test
	public void intergrateTest(){
		Board testBoard = new Board();
		assertEquals("winning condition not satisfied", testBoard.board[0] , null);
		testBoard.inputSymbol("x", 0);
		testBoard.inputSymbol("x", 1);
		testBoard.inputSymbol("x", 2);
		assertEquals("winning conditon satisfied", testBoard.Win() , "x");
	}

}
