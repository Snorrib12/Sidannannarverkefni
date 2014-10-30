package Sidannarverkefni;

public class player {
	
	public String symbol;
	public int score;
	
	public player(String symbol){
		this.symbol = symbol;
		score = 0;
	}

	public void setSymbol(String newSymbol){
		this.symbol = newSymbol;
	}
}
