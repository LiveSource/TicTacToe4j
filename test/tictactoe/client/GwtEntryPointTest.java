package tictactoe.client;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * Test Class: TicTacToe. Entry point classes define <code>onModuleLoad()</code>
 * .
 * 
 */
public class GwtEntryPointTest extends GWTTestCase {

	@Override
	public String getModuleName() {

		return "tictactoe.TicTacToe";
	}

	public void testOnModuleLoad() {

		new GwtEntryPoint().onModuleLoad();

		assertTrue(true);
	}

}
