package com.codecamp.tictactoe.client.userFeatures;

import com.codecamp.tictactoe.client.JudgeService;
import com.codecamp.tictactoe.client.TicTacToe;
import com.google.gwt.user.client.ui.HTMLTable.Cell;

/**
 * Realizes a move in the game.
 * 
 * @feature
 */
public class PlayerMove {

	/**
	 * When the player clicks in a cell, the game draws an O or a X on the game
	 * grid depending on which player's turn it is.
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
	 * Finds out if a cell was already selected.
	 */
	private static boolean cellIsEmpty(GameGrid gameGrid, Cell cell) {

		String cellText = TicTacToe.currentGame[cell.getRowIndex()][cell
				.getCellIndex()];

		return cellText == null;
	}

	/**
	 * Switches between players. If X played last, it is now O's turn to plays,
	 * and vice versa.
	 */
	public static void toggleCurrentPlayer() {

		if (TicTacToe.currentPlayer.equals("X"))
			TicTacToe.currentPlayer = "O";

		else if (TicTacToe.currentPlayer.equals("O"))
			TicTacToe.currentPlayer = "X";
	}

}
