package br.bruno.tictactoegamelogic;

import br.bruno.tictactoegamegraphic.*;

public class Player {
	private String playerName;
	private String symbol;
	private boolean winner;
	
	public Player(String playerName, String symbol) {
		this.playerName = playerName;
		this.symbol = symbol;
	}

	private void fillSquare(int i, int j, TicTacToe ticTacToe) {
		switch(String.valueOf(i) + String.valueOf(j)) {
			case "00":
				ticTacToe.getSquare00().setText(this.symbol);
				break;
			case "01":
				ticTacToe.getSquare01().setText(this.symbol);
				break;
			case "02":
				ticTacToe.getSquare02().setText(this.symbol);
				break;
			case "10":
				ticTacToe.getSquare10().setText(this.symbol);
				break;
			case "11":
				ticTacToe.getSquare11().setText(this.symbol);
				break;
			case "12":
				ticTacToe.getSquare12().setText(this.symbol);
				break;
			case "20":
				ticTacToe.getSquare20().setText(this.symbol);
				break;
			case "21":
				ticTacToe.getSquare21().setText(this.symbol);
				break;
			case "22":
				ticTacToe.getSquare22().setText(this.symbol);
				break;
			default:
				break;
		}
	}
	
	
	public void play(Board board, int xSquare, int ySquare, TicTacToe ticTacToe) {
		board.getGameMatrix()[xSquare][ySquare] = this.symbol;
		fillSquare(xSquare, ySquare, ticTacToe);
		checkForWinner(xSquare, ySquare, board);
	}
	
	private void checkForWinner(int i, int j, Board board) {
		switch(i) {
			case 0:
				if(j == 0) {
					if((board.getGameMatrix()[0][1].equals(this.symbol) && board.getGameMatrix()[0][2].equals(this.symbol)) ||
							(board.getGameMatrix()[1][0].equals(this.symbol) && board.getGameMatrix()[2][0].equals(this.symbol)) ||
							(board.getGameMatrix()[1][1].equals(this.symbol) && board.getGameMatrix()[2][2].equals(this.symbol))) {
						this.winner = true;
					}
				} else if(j == 1) {
					if((board.getGameMatrix()[0][0].equals(this.symbol) && board.getGameMatrix()[0][2].equals(this.symbol)) ||
							(board.getGameMatrix()[1][1].equals(this.symbol) && board.getGameMatrix()[2][1].equals(this.symbol))) {
						this.winner = true;
					}
				} else if(j == 2) {
					if((board.getGameMatrix()[0][0].equals(this.symbol) && board.getGameMatrix()[0][1].equals(this.symbol)) ||
							(board.getGameMatrix()[1][2].equals(this.symbol) && board.getGameMatrix()[2][2].equals(this.symbol)) ||
							(board.getGameMatrix()[1][1].equals(this.symbol) && board.getGameMatrix()[2][0].equals(this.symbol))) {
						this.winner = true;
					}
				}
				break;
				
			case 1:
				if(j == 0) {
					if((board.getGameMatrix()[0][0].equals(this.symbol) && board.getGameMatrix()[2][0].equals(this.symbol)) ||
							(board.getGameMatrix()[1][1].equals(this.symbol) && board.getGameMatrix()[1][2].equals(this.symbol))) {
						this.winner = true;
					}
				} else if(j == 1) {
					if((board.getGameMatrix()[1][0].equals(this.symbol) && board.getGameMatrix()[1][2].equals(this.symbol)) ||
							(board.getGameMatrix()[0][1].equals(this.symbol) && board.getGameMatrix()[2][1].equals(this.symbol)) ||
							(board.getGameMatrix()[0][0].equals(this.symbol) && board.getGameMatrix()[2][2].equals(this.symbol)) ||
							(board.getGameMatrix()[0][2].equals(this.symbol) && board.getGameMatrix()[2][0].equals(this.symbol))) {
						this.winner = true;
					}
				} else if(j == 2) {
					if((board.getGameMatrix()[0][2].equals(this.symbol) && board.getGameMatrix()[2][2].equals(this.symbol)) ||
							(board.getGameMatrix()[1][0].equals(this.symbol) && board.getGameMatrix()[1][1].equals(this.symbol))) {
						this.winner = true;
					}
				}
				break;
				
			case 2:
				if(j == 0) {
					if((board.getGameMatrix()[0][0].equals(this.symbol) && board.getGameMatrix()[1][0].equals(this.symbol)) ||
							(board.getGameMatrix()[2][1].equals(this.symbol) && board.getGameMatrix()[2][2].equals(this.symbol)) ||
							(board.getGameMatrix()[1][1].equals(this.symbol) && board.getGameMatrix()[0][2].equals(this.symbol))) {
						this.winner = true;
					}
				} else if(j == 1) {
					if((board.getGameMatrix()[2][0].equals(this.symbol) && board.getGameMatrix()[2][2].equals(this.symbol)) ||
							(board.getGameMatrix()[0][1].equals(this.symbol) && board.getGameMatrix()[1][1].equals(this.symbol))) {
						this.winner = true;
					}
				} else if(j == 2) {
					if((board.getGameMatrix()[2][0].equals(this.symbol) && board.getGameMatrix()[2][1].equals(this.symbol)) ||
							(board.getGameMatrix()[0][2].equals(this.symbol) && board.getGameMatrix()[1][2].equals(this.symbol)) ||
							(board.getGameMatrix()[0][0].equals(this.symbol) && board.getGameMatrix()[1][1].equals(this.symbol))) {
						this.winner = true;
					}
				}
				break;
			
			default:
				break;
		}
	}

	public String getPlayerName() {
		return this.playerName;
	}
	
	public boolean isWinner() {
		return this.winner;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
}
