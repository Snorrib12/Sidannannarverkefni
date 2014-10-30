package Sidannarverkefni;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Game {
	public static void printBoard(Board board){
		for(int i = 1; i <= 9;i++){
			if(board.board[i-1] == null){
				StdOut.print(". ");
			}
			else{
				StdOut.print(board.board[i-1] + " ");
			}
			if(i%3 == 0 ) StdOut.println();
		}
	}
	
	public static void main(String [ ] args)
	{
	      player player1 = new player("x");
	      player player2 = new player("o");
	      boolean cont = true;
	      int input = 0;
	      String continput = "";
	      String winner = null;
	      boolean player = true;
	      while(cont){
	    	  Board playBoard = new Board();  
	    	  StdOut.print("input placement for your symbol (0-8)");
	    	  StdOut.println();
	    	  while(true){
	    		  input = StdIn.readInt();
		    	  if(player){
		    		  playBoard.inputSymbol("x", input);
		    		  player = !player;
		    	  }
		    	  else{
		    		  playBoard.inputSymbol("o", input);
		    		  player = !player;
		    	  }
		    	  printBoard(playBoard);
		    	  winner = playBoard.Win();
		    	  if(winner != null){
		    		  if(winner == player1.symbol){
		    			  StdOut.println("player 1 wins");
		    			  player1.win();
		    			  player2.lose();
		    		  }
		    		  else{
		    			  StdOut.println("player 2 wins");
		    			  player1.lose();
		    			  player2.win();
		    		  }
		    		  break;
		    	  }
		    	  
	    	  }
		      StdOut.println("score is player1: "+ player1.score + " player2: " + player2.score);
	    	  StdOut.println("continue?(y/n)");
		      continput = StdIn.readLine();
		      if(continput.toLowerCase() == "y") {
		    	  cont = true;
		      }
		      else {
		    	  cont = false;
		      }
		      
	      }
	}
}
