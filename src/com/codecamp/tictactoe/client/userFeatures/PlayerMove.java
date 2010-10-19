package com.codecamp.tictactoe.client.userFeatures;

import com.codecamp.tictactoe.client.JudgeService;
import com.codecamp.tictactoe.client.TicTacToe;
import com.google.gwt.user.client.ui.HTMLTable.Cell;

/**
 * Draws an X or an O on the Game Board depending on which player's turn it is,
 * but only if the selected cell is empty.
 * 
 * @feature
 */
public class PlayerMove {

	private static boolean cellIsEmpty(GameGrid gameGrid, Cell cell) {

		String cellText = TicTacToe.currentGame[cell.getRowIndex()][cell
				.getCellIndex()];

		return cellText == null;
	}

	public static void makeMove(GameGrid gameGrid, Cell cell) {

		if (cellIsEmpty(gameGrid, cell)) {

			String marker = "<font size=6><b>" + TicTacToe.currentPlayer
					+ "</b></font>";

			gameGrid.setHTML(cell.getRowIndex(), cell.getCellIndex(), marker);

			TicTacToe.currentGame[cell.getRowIndex()][cell.getCellIndex()] = TicTacToe.currentPlayer;

			toggleCurrentPlayer();
		}

		JudgeService.checkForWinner(TicTacToe.currentGame);
	}

	private static void toggleCurrentPlayer() {

		if (TicTacToe.currentPlayer.equals("X"))
			TicTacToe.currentPlayer = "O";

		else if (TicTacToe.currentPlayer.equals("O"))
			TicTacToe.currentPlayer = "X";
	}

}
