package Sidannarverkefni;

public class player {
	
	private String symbol;
	private int score;
	
	public player(String symbol){
		this.symbol = symbol;
		score = 0;
	}
	public String symbol(){
		return this.symbol;
	}
	public int score(){
		return this.score;
	}
	public void addScore(){
		this.score++;
	}
	public void setSymbol(String newSymbol){
		this.symbol = newSymbol;
	}
	public void win(){
		this.addScore();
		if(this.symbol == "x") setSymbol("o");
		else setSymbol("x");
	}
	public void lose(){
		if(this.symbol == "x") setSymbol("o");
		else setSymbol("x");
	}
}
