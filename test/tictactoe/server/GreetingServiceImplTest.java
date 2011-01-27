package tictactoe.server;

import junit.framework.TestCase;
import tictactoe.shared.GameEntity;

/**
 * Test Class: GreetingServiceImpl. The server side implementation of the RPC
 * service.
 * 
 */
public class GreetingServiceImplTest extends TestCase {

	public void testCheckForWinner() {

		GameEntity gameStatus = new GameEntity();

		int currentMoveRow = 2;

		int currentMoveColumn = 1;

		GameEntity checkForWinnerTested = new GreetingServiceImpl()
				.checkForWinner(gameStatus, currentMoveRow, currentMoveColumn);

		assertEquals(checkForWinnerTested, null);
	}

}
