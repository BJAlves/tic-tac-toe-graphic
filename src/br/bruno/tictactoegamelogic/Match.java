package br.bruno.tictactoegamelogic;

import br.bruno.tictactoegamegraphic.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Match implements ActionListener {
	private Player playerOne;
	private Player playerTwo;
	private Board board;
	private TicTacToe ticTacToe;
	private Player actualPlayer;
	private String messageJTextAreaInfo;
	private int xSquare;
	private int ySquare;
	
	public Match(TicTacToe ticTacToe) {
		this.ticTacToe = ticTacToe;
		this.playerOne = new Player(this.ticTacToe.getLabelPlayerOne().getText(), "X");
		this.playerTwo = new Player(this.ticTacToe.getLabelPlayerTwo().getText(), "O");
		this.board = new Board();
		this.actualPlayer = this.playerOne;
		this.messageJTextAreaInfo = "Starting the tic-tac-toe game!\n";
		initSquareListeners();
		passTheTurn();
	}
		
	private void showDialog(String message) {
		Locale locale = new Locale("en", "US");
		JOptionPane.setDefaultLocale(locale);
		
		if (JOptionPane.showConfirmDialog(null, "Result of this match: " + message + "Want to play a new game?\n", "End of the match",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			this.ticTacToe.restartGame();
		} else {
			this.ticTacToe.dispose();
		}
	}
	
	private void directTheGame(Player nextPlayer, JTextArea jTextArea) {
		String textArea = "";
		String weTiedMessage = "";
		String winnerMessage = "";
		if((! this.actualPlayer.isWinner()) && (! this.board.gameMatrixIsFilled())) {
			this.actualPlayer = nextPlayer;
			passTheTurn();
		} else if((! this.actualPlayer.isWinner()) && (this.board.gameMatrixIsFilled())) {
			textArea = jTextArea.getText();
			weTiedMessage = "We tied!\n";
			textArea += weTiedMessage;
			jTextArea.setText(textArea);
			invalidateClickOnSquaresAfterEndGame();
			showDialog(weTiedMessage);	
		} else {
			textArea = jTextArea.getText();
			winnerMessage = this.actualPlayer.getPlayerName() + " is the winner!\n";
			textArea += winnerMessage;
			jTextArea.setText(textArea);
			invalidateClickOnSquaresAfterEndGame();
			showDialog(winnerMessage);
		}
	}
	
	private void invalidateClickOnSquaresAfterEndGame() {
		this.ticTacToe.getSquare00().setEnabled(false);
		this.ticTacToe.getSquare01().setEnabled(false);
		this.ticTacToe.getSquare02().setEnabled(false);
		this.ticTacToe.getSquare10().setEnabled(false);
		this.ticTacToe.getSquare11().setEnabled(false);
		this.ticTacToe.getSquare12().setEnabled(false);
		this.ticTacToe.getSquare20().setEnabled(false);
		this.ticTacToe.getSquare21().setEnabled(false);
		this.ticTacToe.getSquare22().setEnabled(false);
	}
	
	private void initSquareListeners() {
		this.ticTacToe.getSquare00().addActionListener(this);
		this.ticTacToe.getSquare01().addActionListener(this);
		this.ticTacToe.getSquare02().addActionListener(this);
		this.ticTacToe.getSquare10().addActionListener(this);
		this.ticTacToe.getSquare11().addActionListener(this);
		this.ticTacToe.getSquare12().addActionListener(this);
		this.ticTacToe.getSquare20().addActionListener(this);
		this.ticTacToe.getSquare21().addActionListener(this);
		this.ticTacToe.getSquare22().addActionListener(this);
	}
	
	private void passTheTurn() {
		this.messageJTextAreaInfo += this.actualPlayer.getPlayerName() + "'s turn" + "\n";
		this.ticTacToe.getGameLog().setText(this.messageJTextAreaInfo);
	}
	
	public Player getPlayerOne() {
		return this.playerOne;
	}
	
	public Player getPlayerTwo() {
		return this.playerTwo;		
	}
	
	public Board getBoard() {
		return this.board;
	}
	
	public void verifySquare(Object object) {
		if(object == this.ticTacToe.getSquare00()) {
			this.xSquare = 0;
			this.ySquare = 0;
			this.ticTacToe.getSquare00().removeActionListener(this);
		} else if(object == this.ticTacToe.getSquare01()) {
			this.xSquare = 0;
			this.ySquare = 1;
			this.ticTacToe.getSquare01().removeActionListener(this);
		} else if(object == this.ticTacToe.getSquare02()) {
			this.xSquare = 0;
			this.ySquare = 2;
			this.ticTacToe.getSquare02().removeActionListener(this);
		} else if(object == this.ticTacToe.getSquare10()) {
			this.xSquare = 1;
			this.ySquare = 0;
			this.ticTacToe.getSquare10().removeActionListener(this);
		} else if(object == this.ticTacToe.getSquare11()) {
			this.xSquare = 1;
			this.ySquare = 1;
			this.ticTacToe.getSquare11().removeActionListener(this);
		} else if(object == this.ticTacToe.getSquare12()) {
			this.xSquare = 1;
			this.ySquare = 2;
			this.ticTacToe.getSquare12().removeActionListener(this);
		} else if(object == this.ticTacToe.getSquare20()) {
			this.xSquare = 2;
			this.ySquare = 0;
			this.ticTacToe.getSquare20().removeActionListener(this);
		} else if(object == this.ticTacToe.getSquare21()) {
			this.xSquare = 2;
			this.ySquare = 1;
			this.ticTacToe.getSquare21().removeActionListener(this);
		} else if(object == this.ticTacToe.getSquare22()) {
			this.xSquare = 2;
			this.ySquare = 2;
			this.ticTacToe.getSquare22().removeActionListener(this);
		}		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		verifySquare(e.getSource());
		this.actualPlayer.play(this.board, this.xSquare, this.ySquare, this.ticTacToe);
		switch(this.actualPlayer.getSymbol()) {
			case "X":
				directTheGame(this.playerTwo, this.ticTacToe.getGameLog());
				break;
			case "O":
				directTheGame(this.playerOne, this.ticTacToe.getGameLog());
				break;
			default:
				break;
		}				
	}
	
	public int getxSquare() {
		return this.xSquare;
	}
	
	public int getySquare() {
		return this.ySquare;
	}
}
