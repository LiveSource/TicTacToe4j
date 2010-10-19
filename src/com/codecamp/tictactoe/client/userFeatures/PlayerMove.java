package com.codecamp.tictactoe.client.userFeatures;

import com.codecamp.tictactoe.client.JudgeService;
import com.codecamp.tictactoe.client.TicTacToe;
import com.google.gwt.user.client.ui.HTMLTable.Cell;

/**
 * Realizes all the moves selected by the players.
 * 
 * @feature
 */
public class PlayerMove {

	/**
	 * When the player clicks in a cell, the game draws an X or an O on the Game
	 * Board depending on which player's turn it is.
	 */
	public static void makeMove(GameGrid gameGrid, Cell cell) {

		if (TicTacToe.sequenceWinner == null && cellIsEmpty(gameGrid, cell)) {

			String marker = "<font size=6><b>" + TicTacToe.currentPlayer
					+ "</b></font>";

			gameGrid.setHTML(cell.getRowIndex(), cell.getCellIndex(), marker);

			TicTacToe.currentGame[cell.getRowIndex()][cell.getCellIndex()] = TicTacToe.currentPlayer;

			JudgeService.checkForWinner(TicTacToe.currentGame,
					cell.getRowIndex(), cell.getCellIndex());
		}
	}

	/**
	 * The player can only select cells that weren't already selected
	 * previously.
	 */
	private static boolean cellIsEmpty(GameGrid gameGrid, Cell cell) {

		String cellText = TicTacToe.currentGame[cell.getRowIndex()][cell
				.getCellIndex()];

		return cellText == null;
	}

	/**
	 * After the player move, the game prepares itself for the next player.
	 */
	public static void toggleCurrentPlayer() {

		if (TicTacToe.currentPlayer.equals("X"))
			TicTacToe.currentPlayer = "O";

		else if (TicTacToe.currentPlayer.equals("O"))
			TicTacToe.currentPlayer = "X";
	}

}
