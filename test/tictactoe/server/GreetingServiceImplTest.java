package tictactoe.server;

import junit.framework.TestCase;

/**
 * Test Class: GreetingServiceImpl. The server side implementation of the RPC
 * service.
 * 
 */
public class GreetingServiceImplTest extends TestCase {

	public void testCheckForWinner() {

		String[][] gameStatus = new String[3][3];

		int currentMoveRow = 2;

		int currentMoveColumn = 1;

		String checkForWinnerTested = new GreetingServiceImpl().checkForWinner(
				gameStatus, currentMoveRow, currentMoveColumn);

		assertEquals(checkForWinnerTested, null);
	}

}
