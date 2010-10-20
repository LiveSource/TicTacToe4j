package com.codecamp.tictactoe.client.userFeatures;

import com.codecamp.tictactoe.client.TicTacToe;



/** 
 * Highlights the three consecutive marks in a horizontal, vertical, or diagonal
 row that won the game.
TODO: make the row go green not red when someone wins
 * 
 * @TODO
 * @feature 
 */
public class WinningSequence {

	public static void showWinner(int currentMoveRow, int currentMoveColumn,
			String sequenceWinner) {

		String marker = "<font size=6 color=\"green\"><b>"
				+ TicTacToe.currentPlayer + "</b></font>";

		if (sequenceWinner.equals("row")) {

			GameBoard.gameGrid.setHTML(currentMoveRow, 0, marker);
			GameBoard.gameGrid.setHTML(currentMoveRow, 1, marker);
			GameBoard.gameGrid.setHTML(currentMoveRow, 2, marker);

		} else if (sequenceWinner.equals("column")) {

			GameBoard.gameGrid.setHTML(0, currentMoveColumn, marker);
			GameBoard.gameGrid.setHTML(1, currentMoveColumn, marker);
			GameBoard.gameGrid.setHTML(2, currentMoveColumn, marker);

		} else if (sequenceWinner.equals("diagonalRight")) {

			GameBoard.gameGrid.setHTML(0, 2, marker);
			GameBoard.gameGrid.setHTML(1, 1, marker);
			GameBoard.gameGrid.setHTML(2, 0, marker);

		} else if (sequenceWinner.equals("diagonalLeft")) {

			GameBoard.gameGrid.setHTML(0, 0, marker);
			GameBoard.gameGrid.setHTML(1, 1, marker);
			GameBoard.gameGrid.setHTML(2, 2, marker);
		}
	}

}
