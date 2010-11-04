package tictactoe.server;

/** 
 * 
 * 
 * @entity 
 */

public class Judge {

	public static String checkForWinner(String[][] gameStatus,
			int currentMoveRow, int currentMoveColumn) {

		String sequenceWinner = null;

		String currentPlayer = gameStatus[currentMoveRow][currentMoveColumn];

		if (checkWinnerRow(gameStatus, currentPlayer, currentMoveRow)) {

			sequenceWinner = "row";

		} else if (checkWinnerColumn(gameStatus, currentPlayer,
				currentMoveColumn)) {

			sequenceWinner = "column";

		} else if (checkWinnerDiagonalRight(gameStatus, currentPlayer)) {

			sequenceWinner = "diagonalRight";

		} else if (checkWinnerDiagonalLeft(gameStatus, currentPlayer)) {

			sequenceWinner = "diagonalLeft";
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
