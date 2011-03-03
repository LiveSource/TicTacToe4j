package tictactoe.client.userInterface;

import tictactoe.client.GameInitialization;
import tictactoe.client.serverCalls.CheckWinner;
import tictactoe.shared.Player;

import com.google.gwt.user.client.ui.HTMLTable.Cell;



/** 
 * Performs a move in the game.
 * 
 * @Requirement 
 */
public class PlayerMove {

	/**
	 * When the player clicks in a cell, the game draws an O or a X on the game
	 * grid depending on which player's turn it is.
	 */
	public static void makeMove(GameGrid gameGrid, Cell cell) {

		if (!GameInitialization.waitingMoveFlag
				&& GameInitialization.currentGameStatus.getSequenceWinner() == null
				&& isCellEmpty(gameGrid, cell)) {

			GameInitialization.waitingMoveFlag = true;

			String marker = showPlayerIcon(GameInitialization.currentGameStatus
					.getCurrentPlayer().getPlayerIcon());

			gameGrid.setHTML(cell.getRowIndex(), cell.getCellIndex(), marker);

			GameInitialization.currentGameStatus.getGameMoves()[cell
					.getRowIndex()][cell.getCellIndex()] = GameInitialization.currentGameStatus
					.getCurrentPlayer();

			CheckWinner.checkForWinner(GameInitialization.currentGameStatus,
					cell.getRowIndex(), cell.getCellIndex());
		}
	}

	/**
	 * The Player can select a cell only if it wasn't selected yet.
	 */
	private static boolean isCellEmpty(GameGrid gameGrid, Cell cell) {

		Player cellPlayer = GameInitialization.currentGameStatus.getGameMoves()[cell
				.getRowIndex()][cell.getCellIndex()];

		return (cellPlayer == null);
	}

	/**
	 * Make the current player icon shows up in the grid cell.
	 */
	private static String showPlayerIcon(String playerIcon) {

		String iconColor = "darkgreen";
		if (playerIcon.equals(GameInitialization.playerO.getPlayerIcon())) {

			iconColor = "darkblue";
		}

		String marker = "<font size=6 color=" + iconColor + "><b>" + playerIcon
				+ "</b></font>";

		return marker;
	}

	public static void toggleCurrentPlayer() {

		if (GameInitialization.currentGameStatus.getCurrentPlayer()
				.getPlayerIcon().equals(Player.PlayerIcon_X))
			GameInitialization.currentGameStatus
					.setCurrentPlayer(GameInitialization.playerO);

		else if (GameInitialization.currentGameStatus.getCurrentPlayer()
				.getPlayerIcon().equals(Player.PlayerIcon_O))
			GameInitialization.currentGameStatus
					.setCurrentPlayer(GameInitialization.playerX);

		GameInitialization.waitingMoveFlag = false;
	}

}
