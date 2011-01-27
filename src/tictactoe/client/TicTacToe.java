package tictactoe.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Anchor class to init the system by the Google Web Toolkit (EntryPoint).
 * 
 * @Architecture
 */
public class TicTacToe implements EntryPoint {

	public void onModuleLoad() {

		new Initialization();

		new HelpInitialization();
	}
}
