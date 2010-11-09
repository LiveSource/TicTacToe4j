package tictactoe.server;

/**
 * Define all the rules to identify the winner of the game.
 * 
 * @entity
 */

public class Judge {

	public static final String ROW = "row";
	public static final String COLUMN = "column";
	public static final String DIAGONAL_RIGHT = "diagonalRight";
	public static final String DIAGONAL_LEFT = "diagonalLeft";

	public static String checkForWinner(String[][] gameStatus,
			int currentMoveRow, int currentMoveColumn) {

		String sequenceWinner = null;

		String currentPlayer = gameStatus[currentMoveRow][currentMoveColumn];

		if (currentPlayer != null) {

			if (checkWinnerRow(gameStatus, currentPlayer, currentMoveRow)) {

				sequenceWinner = ROW;

			} else if (checkWinnerColumn(gameStatus, currentPlayer,
					currentMoveColumn)) {

				sequenceWinner = COLUMN;

			} else if (checkWinnerDiagonalRight(gameStatus, currentPlayer)) {

				sequenceWinner = DIAGONAL_RIGHT;

			} else if (checkWinnerDiagonalLeft(gameStatus, currentPlayer)) {

				sequenceWinner = DIAGONAL_LEFT;
			}
		}

		return sequenceWinner;
	}

	private static boolean checkWinnerRow(String[][] gameStatus,
			String currentPlayer, int currentMoveRow) {

		if (currentPlayer.equals(gameStatus[currentMoveRow][0])
				&& currentPlayer.equals(gameStatus[currentMoveRow][1])
				&& currentPlayer.equals(gameStatus[currentMoveRow][2])) {

			return true;
		}

		return false;
	}

	private static boolean checkWinnerColumn(String[][] gameStatus,
			String currentPlayer, int currentMoveColumn) {

		if (currentPlayer.equals(gameStatus[0][currentMoveColumn])
				&& currentPlayer.equals(gameStatus[1][currentMoveColumn])
				&& currentPlayer.equals(gameStatus[2][currentMoveColumn])) {

			return true;
		}

		return false;
	}

	private static boolean checkWinnerDiagonalRight(String[][] gameStatus,
			String currentPlayer) {

		if (currentPlayer.equals(gameStatus[0][2])
				&& currentPlayer.equals(gameStatus[1][1])
				&& currentPlayer.equals(gameStatus[2][0])) {

			return true;
		}

		return false;
	}

	private static boolean checkWinnerDiagonalLeft(String[][] gameStatus,
			String currentPlayer) {

		if (currentPlayer.equals(gameStatus[0][0])
				&& currentPlayer.equals(gameStatus[1][1])
				&& currentPlayer.equals(gameStatus[2][2])) {

			return true;

		}

		return false;
	}
}
