package Sidannarverkefni;

public class Board {
	public String[] board;
	
	public Board(){
		board = new String[9];
	}
	public void inputSymbol(String symbol,int place){
		this.board[place] = symbol;
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
