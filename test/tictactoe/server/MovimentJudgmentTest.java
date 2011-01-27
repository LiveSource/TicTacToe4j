package tictactoe.server;

import junit.framework.TestCase;
import tictactoe.GameEntityTest;
import tictactoe.PlayersTest;
import tictactoe.shared.GameEntity;

/**
 * Test Class: Judge. Define all the rules to identify the winner of the game.
 * 
 */
public class MovimentJudgmentTest extends TestCase {

	public void testCheckForWinner_Loose() {

		int currentMoveRow = 1;

		int currentMoveColumn = 2;

		GameEntity gameEntity = GameEntityTest.returnGameEntity();

		gameEntity.getGameMoves()[currentMoveRow][currentMoveColumn] = PlayersTest
				.returnPlayerO();

		GameEntity checkForWinnerTested = MovimentJudgment.checkForWinner(
				gameEntity, currentMoveRow, currentMoveColumn);

		assertEquals(checkForWinnerTested, null);
	}

	public void testCheckForWinner_Win() {

		GameEntity gameEntity = GameEntityTest.returnGameEntity();

		int currentMoveRow = 2;

		int currentMoveColumn = 2;

		gameEntity.getGameMoves()[currentMoveRow][currentMoveColumn] = PlayersTest
				.returnPlayerX();

		GameEntity checkForWinnerTested = MovimentJudgment.checkForWinner(
				gameEntity, currentMoveRow, currentMoveColumn);

		assertEquals(checkForWinnerTested, GameEntity.SEQUENCE_DIAGONAL_LEFT);
	}

}
