package tictactoe.client.userInterface;

import tictactoe.client.Initialization;
import tictactoe.client.serverCalls.CheckWinner;
import tictactoe.shared.Player;

import com.google.gwt.user.client.ui.HTMLTable.Cell;





/** 
 * Performs a move in the game.
 * 
 * @Feature 
 */
public class PlayerMove {

	/**
	 * When the player clicks in a cell, the game draws an O or a X on the game
	 * grid depending on which player's turn it is.
	 */
	public static void makeMove(GameGrid gameGrid, Cell cell) {

		if (!Initialization.waitingFlag
				&& Initialization.currentGame.getSequenceWinner() == null
				&& cellIsEmpty(gameGrid, cell)) {

			Initialization.waitingFlag = true;

			String marker = "<font size=6><b>"
					+ Initialization.currentGame.getCurrentPlayer()
							.getPlayerIcon() + "</b></font>";

			gameGrid.setHTML(cell.getRowIndex(), cell.getCellIndex(), marker);

			Initialization.currentGame.getGameMoves()[cell.getRowIndex()][cell
					.getCellIndex()] = Initialization.currentGame
					.getCurrentPlayer();

			CheckWinner.checkForWinner(Initialization.currentGame,
					cell.getRowIndex(), cell.getCellIndex());
		}
	}

	/**
	 * The Player can select a cell only if it wasn't already selected.
	 */
	private static boolean cellIsEmpty(GameGrid gameGrid, Cell cell) {

		Player cellPlayer = Initialization.currentGame.getGameMoves()[cell
				.getRowIndex()][cell.getCellIndex()];

		return (cellPlayer == null);
	}

	public static void toggleCurrentPlayer() {

		if (Initialization.currentGame.getCurrentPlayer().getPlayerIcon()
				.equals(Player.PlayerIcon_X))
			Initialization.currentGame.setCurrentPlayer(Initialization.playerO);

		else if (Initialization.currentGame.getCurrentPlayer().getPlayerIcon()
				.equals(Player.PlayerIcon_O))
			Initialization.currentGame.setCurrentPlayer(Initialization.playerX);

		Initialization.waitingFlag = false;
	}

}
