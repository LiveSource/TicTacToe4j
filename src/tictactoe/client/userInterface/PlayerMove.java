package tictactoe.client.userInterface;

import tictactoe.client.GlobalVariables;
import tictactoe.client.serverCalls.CheckWinner;
import tictactoe.shared.Player;

import com.google.gwt.user.client.ui.HTMLTable.Cell;







/** 
 * Performs a move in the game.
 * 
 * @Blocked
 * @MainFeature 
 */
public class PlayerMove {

	/**
	 * When the player clicks in a cell, the game draws an O or a X on the game
	 * grid depending on which player's turn it is.
	 */
	public static void makeMove(GameGrid gameGrid, Cell selectedCell) {

		if (!GlobalVariables.waitingMoveFlag
				&& GlobalVariables.currentGameStatus.getSequenceWinner() == null
				&& isCellEmpty(gameGrid, selectedCell)) {

			GlobalVariables.waitingMoveFlag = true;

			String marker = showPlayerSymbol(GlobalVariables.currentGameStatus
					.getCurrentPlayer().getPlayerSymbol());

			gameGrid.setHTML(selectedCell.getRowIndex(),
					selectedCell.getCellIndex(), marker);

			GlobalVariables.currentGameStatus.getGameMoves()[selectedCell
					.getRowIndex()][selectedCell.getCellIndex()] = GlobalVariables.currentGameStatus
					.getCurrentPlayer();

			CheckWinner.checkForWinner(GlobalVariables.currentGameStatus,
					selectedCell.getRowIndex(), selectedCell.getCellIndex());
		}
	}

	/**
	 * The Player can select a cell only if it wasn't selected yet.
	 */
	private static boolean isCellEmpty(GameGrid gameGrid, Cell cell) {

		Player cellPlayer = GlobalVariables.currentGameStatus.getGameMoves()[cell
				.getRowIndex()][cell.getCellIndex()];

		return (cellPlayer == null);
	}

	/**
	 * Shows the right player symbol for the current player in the grid cell.
	 */
	private static String showPlayerSymbol(String playerSymbol) {

		String symbolColor = "darkgreen";
		if (playerSymbol.equals(GlobalVariables.playerO.getPlayerSymbol())) {

			symbolColor = "darkblue";
		}

		String symbol = "<font size=6 color=" + symbolColor + "><b>"
				+ playerSymbol + "</b></font>";

		return symbol;
	}

	public static void toggleCurrentPlayer() {

		if (GlobalVariables.currentGameStatus.getCurrentPlayer()
				.getPlayerSymbol().equals(Player.PlayerSymbol_X))
			GlobalVariables.currentGameStatus
					.setCurrentPlayer(GlobalVariables.playerO);

		else if (GlobalVariables.currentGameStatus.getCurrentPlayer()
				.getPlayerSymbol().equals(Player.PlayerSymbol_O))
			GlobalVariables.currentGameStatus
					.setCurrentPlayer(GlobalVariables.playerX);

		GlobalVariables.waitingMoveFlag = false;
	}

}
