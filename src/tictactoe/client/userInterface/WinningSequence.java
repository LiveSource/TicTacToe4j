package tictactoe.client.userInterface;

import helpagile.client.exportation.HelpHint;
import tictactoe.client.GlobalVariables;
import tictactoe.shared.GameEntity;

/**
 * If there is three consecutive marks in a horizontal, vertical, or diagonal
 * series, the current Player wins the game, the system highlights the winning
 * sequence and the game is over.
 * 
 * @Feature
 */
public class WinningSequence {

	public static void showWinner(int currentMoveRow, int currentMoveColumn) {

		String marker = "<font size=7 color=\"red\"><b>"
				+ GlobalVariables.currentGameStatus.getCurrentPlayer()
						.getPlayerSymbol() + "</b></font>";

		if (GlobalVariables.currentGameStatus.getSequenceWinner().equals(
				GameEntity.SEQUENCE_ROW)) {

			GameBoard.gameGrid.setHTML(currentMoveRow, 0, marker);
			GameBoard.gameGrid.setHTML(currentMoveRow, 1, marker);
			GameBoard.gameGrid.setHTML(currentMoveRow, 2, marker);

		} else if (GlobalVariables.currentGameStatus.getSequenceWinner()
				.equals(GameEntity.SEQUENCE_COLUMN)) {

			GameBoard.gameGrid.setHTML(0, currentMoveColumn, marker);
			GameBoard.gameGrid.setHTML(1, currentMoveColumn, marker);
			GameBoard.gameGrid.setHTML(2, currentMoveColumn, marker);

		} else if (GlobalVariables.currentGameStatus.getSequenceWinner()
				.equals(GameEntity.SEQUENCE_DIAGONAL_RIGHT)) {

			GameBoard.gameGrid.setHTML(0, 2, marker);
			GameBoard.gameGrid.setHTML(1, 1, marker);
			GameBoard.gameGrid.setHTML(2, 0, marker);

		} else if (GlobalVariables.currentGameStatus.getSequenceWinner()
				.equals(GameEntity.SEQUENCE_DIAGONAL_LEFT)) {

			GameBoard.gameGrid.setHTML(0, 0, marker);
			GameBoard.gameGrid.setHTML(1, 1, marker);
			GameBoard.gameGrid.setHTML(2, 2, marker);
		}

		GameBoard.gameGrid.addClickHandler(HelpHint.getClickHandler(
				"tictactoe.client.userInterface.WinningSequence", null,
				"250px", "en"));
	}

}
