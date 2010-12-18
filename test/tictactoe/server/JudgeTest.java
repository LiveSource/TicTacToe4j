package tictactoe.server;

import junit.framework.TestCase;
import tictactoe.client.TicTacToe;

/**
 * Test Class: Judge. Define all the rules to identify the winner of the game.
 * 
 */
public class JudgeTest extends TestCase {

	private String[][] defineGameStatus() {

		String[][] gameStatus = new String[3][3];

		gameStatus[0][0] = TicTacToe.Player_X;
		gameStatus[0][1] = TicTacToe.Player_O;

		gameStatus[1][1] = TicTacToe.Player_X;

		return gameStatus;
	}

	public void testCheckForWinner_Loose() {

		int currentMoveRow = 1;

		int currentMoveColumn = 2;

		String[][] gameStatus = defineGameStatus();

		gameStatus[currentMoveRow][currentMoveColumn] = TicTacToe.Player_O;

		String checkForWinnerTested = MovimentJudgment.checkForWinner(defineGameStatus(),
				currentMoveRow, currentMoveColumn);

		assertEquals(checkForWinnerTested, null);
	}

	public void testCheckForWinner_Win() {

		String[][] gameStatus = defineGameStatus();

		int currentMoveRow = 2;

		int currentMoveColumn = 2;

		gameStatus[currentMoveRow][currentMoveColumn] = TicTacToe.Player_X;

		String checkForWinnerTested = MovimentJudgment.checkForWinner(gameStatus,
				currentMoveRow, currentMoveColumn);

		assertEquals(checkForWinnerTested, MovimentJudgment.DIAGONAL_LEFT);
	}

}
