package tictactoe.client.userInterface;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Test Class: GameBoard. The web page where the game is shown. Accommodates the
 * game grid and also some options such as a restart button, help, game score,
 * game status, ...
 * 
 */
public class GameBoardTest extends GWTTestCase {

	@Override
	public String getModuleName() {

		return "tictactoe.TicTacToe";
	}

	public void testGameBoard() {

		new GameBoard();

		assertTrue(true);
	}

}
