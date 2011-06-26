package tictactoe.shared;

import java.io.Serializable;
import java.util.Date;



/** 
 * Gather all the information about a particular game.
 * 
 * @
 * @Entity 
 */
public class GameEntity implements Serializable {

	public static final String SEQUENCE_ROW = "row";
	public static final String SEQUENCE_COLUMN = "column";
	public static final String SEQUENCE_DIAGONAL_RIGHT = "diagonalRight";
	public static final String SEQUENCE_DIAGONAL_LEFT = "diagonalLeft";

	private Date date;

	private Player[][] gameMoves;

	private Player currentPlayer;

	private String sequenceWinner;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Player[][] getGameMoves() {
		return gameMoves;
	}

	public void setGameMoves(Player[][] gameMoves) {
		this.gameMoves = gameMoves;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public String getSequenceWinner() {
		return sequenceWinner;
	}

	public void setSequenceWinner(String sequenceWinner) {
		this.sequenceWinner = sequenceWinner;
	}

}
