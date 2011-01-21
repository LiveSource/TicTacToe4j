package tictactoe.client.userInterface;

import tictactoe.client.TicTacToe;
import tictactoe.client.architecture.CallToMovimentJudgment;

import com.google.gwt.user.client.ui.HTMLTable.Cell;

/**
 * Performs a move in the game.
 * 
 * @feature
 */
public class PlayerMove {

	/**
	 * When the player clicks in a cell, the game draws an O or a X on the game
	 * grid depending on which player's turn it is.
	 */
	public static void makeMove(GameGrid gameGrid, Cell cell) {

		if (!TicTacToe.waitingFlag && TicTacToe.sequenceWinner == null
				&& cellIsEmpty(gameGrid, cell)) {

			TicTacToe.waitingFlag = true;

			String marker = "<font size=6><b>" + TicTacToe.currentPlayer
					+ "</b></font>";

			gameGrid.setHTML(cell.getRowIndex(), cell.getCellIndex(), marker);

			TicTacToe.currentGame[cell.getRowIndex()][cell.getCellIndex()] = TicTacToe.currentPlayer;

			CallToMovimentJudgment.checkForWinner(TicTacToe.currentGame,
					cell.getRowIndex(), cell.getCellIndex());
		}
	}

	/**
	 * The Player can select a cell only if it wasn't already selected.
	 */
	private static boolean cellIsEmpty(GameGrid gameGrid, Cell cell) {

		String cellText = TicTacToe.currentGame[cell.getRowIndex()][cell
				.getCellIndex()];

		return cellText == null;
	}

	public static void toggleCurrentPlayer() {

		if (TicTacToe.currentPlayer.equals(TicTacToe.Player_X))
			TicTacToe.currentPlayer = TicTacToe.Player_O;

		else if (TicTacToe.currentPlayer.equals(TicTacToe.Player_O))
			TicTacToe.currentPlayer = TicTacToe.Player_X;

		TicTacToe.waitingFlag = false;
	}

}
