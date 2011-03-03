package tictactoe.client;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Test Class: TicTacToe. Entry point classes define <code>onModuleLoad()</code>
 * .
 * 
 */
public class TicTacToeTest extends GWTTestCase {

	@Override
	public String getModuleName() {

		return "tictactoe.TicTacToe";
	}

	public void testOnModuleLoad() {

		new GWTEntryPoint().onModuleLoad();

		assertTrue(true);
	}

}
