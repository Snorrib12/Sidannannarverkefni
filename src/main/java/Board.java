package Sidannarverkefni;

public class Board {
	private String[] board;
	
	public Board(){
		board = new String[9];
	}
	public String[] board(){
		return this.board;
	}
	public String board(int place){
		return this.board[place];
	}
	public void inputSymbol(String symbol,int place){
		this.board[place] = symbol;
	}
	public boolean isValid(int place){
		if(place < 0 || place > 8){
			return false;
		}
		else if(board[place] != null){
			return false;
		}
		return true;
	}
	public String Win(){
		for(int i = 0 ; i <3;i++){
			if(this.board[0+i] == this.board[3+i] && this.board[0+i] == this.board[6+i]){
				return this.board[0+i];
			}
		}
		for(int j = 0; j < 3 ; j++){
			if(this.board[0+(j*3)] == this.board[1+(j*3)] && this.board[0+(j*3)] == this.board[2+(j*3)]){
				return this.board[0+(j*3)];
			}
		}
		if(this.board[0] == this.board[4] && this.board[0] == this.board[8]){
			return this.board[0];
		}
		if(this.board[2] == this.board[4] && this.board[2] == this.board[6]){
			return this.board[2];
		}
		return null;
	}
	
}
