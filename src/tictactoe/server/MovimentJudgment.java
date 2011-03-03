package tictactoe.server;

import tictactoe.shared.GameEntity;
import tictactoe.shared.Player;



/** 
 * Checks if the player movement ran a winning sequence or not.
 * 
 * @Requirement 
 */
public class MovimentJudgment {

	public static GameEntity checkForWinner(GameEntity currentGame,
			int currentMoveRow, int currentMoveColumn) {

		String sequenceWinner = null;

		Player currentPlayer = currentGame.getGameMoves()[currentMoveRow][currentMoveColumn];

		if (currentPlayer != null) {

			if (checkWinnerRow(currentGame, currentPlayer, currentMoveRow)) {

				sequenceWinner = GameEntity.SEQUENCE_ROW;

			} else if (checkWinnerColumn(currentGame, currentPlayer,
					currentMoveColumn)) {

				sequenceWinner = GameEntity.SEQUENCE_COLUMN;

			} else if (checkWinnerDiagonalRight(currentGame, currentPlayer)) {

				sequenceWinner = GameEntity.SEQUENCE_DIAGONAL_RIGHT;

			} else if (checkWinnerDiagonalLeft(currentGame, currentPlayer)) {

				sequenceWinner = GameEntity.SEQUENCE_DIAGONAL_LEFT;
			}
		}

		currentGame.setSequenceWinner(sequenceWinner);

		return currentGame;
	}

	private static boolean checkWinnerRow(GameEntity currentGame,
			Player currentPlayer, int currentMoveRow) {

		String currentPlayerIcon = currentPlayer.getPlayerIcon();

		if (currentGame.getGameMoves()[currentMoveRow][0] != null
				&& currentGame.getGameMoves()[currentMoveRow][1] != null
				&& currentGame.getGameMoves()[currentMoveRow][2] != null
				&& currentPlayerIcon
						.equals(currentGame.getGameMoves()[currentMoveRow][0]
								.getPlayerIcon())
				&& currentPlayerIcon
						.equals(currentGame.getGameMoves()[currentMoveRow][1]
								.getPlayerIcon())
				&& currentPlayerIcon
						.equals(currentGame.getGameMoves()[currentMoveRow][2]
								.getPlayerIcon())) {

			return true;
		}

		return false;
	}

	private static boolean checkWinnerColumn(GameEntity currentGame,
			Player currentPlayer, int currentMoveColumn) {

		String currentPlayerIcon = currentPlayer.getPlayerIcon();

		if (currentGame.getGameMoves()[0][currentMoveColumn] != null
				&& currentGame.getGameMoves()[1][currentMoveColumn] != null
				&& currentGame.getGameMoves()[2][currentMoveColumn] != null
				&& currentPlayerIcon
						.equals(currentGame.getGameMoves()[0][currentMoveColumn]
								.getPlayerIcon())
				&& currentPlayerIcon
						.equals(currentGame.getGameMoves()[1][currentMoveColumn]
								.getPlayerIcon())
				&& currentPlayerIcon
						.equals(currentGame.getGameMoves()[2][currentMoveColumn]
								.getPlayerIcon())) {

			return true;
		}

		return false;
	}

	private static boolean checkWinnerDiagonalRight(GameEntity currentGame,
			Player currentPlayer) {

		String currentPlayerIcon = currentPlayer.getPlayerIcon();

		if (currentGame.getGameMoves()[0][2] != null
				&& currentGame.getGameMoves()[1][1] != null
				&& currentGame.getGameMoves()[2][0] != null
				&& currentPlayerIcon.equals(currentGame.getGameMoves()[0][2]
						.getPlayerIcon())
				&& currentPlayerIcon.equals(currentGame.getGameMoves()[1][1]
						.getPlayerIcon())
				&& currentPlayerIcon.equals(currentGame.getGameMoves()[2][0]
						.getPlayerIcon())) {

			return true;
		}

		return false;
	}

	private static boolean checkWinnerDiagonalLeft(GameEntity currentGame,
			Player currentPlayer) {

		String currentPlayerIcon = currentPlayer.getPlayerIcon();

		if (currentGame.getGameMoves()[0][0] != null
				&& currentGame.getGameMoves()[1][1] != null
				&& currentGame.getGameMoves()[2][2] != null
				&& currentPlayerIcon.equals(currentGame.getGameMoves()[0][0]
						.getPlayerIcon())
				&& currentPlayerIcon.equals(currentGame.getGameMoves()[1][1]
						.getPlayerIcon())
				&& currentPlayerIcon.equals(currentGame.getGameMoves()[2][2]
						.getPlayerIcon())) {

			return true;

		}

		return false;
	}
}
