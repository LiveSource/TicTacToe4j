package tictactoe.client;

import tictactoe.client.architecture.HelpInitialization;

import com.google.gwt.core.client.EntryPoint;

/**
 * Anchor class to init the system by the Google Web Toolkit (EntryPoint).
 * 
 * @architecture
 */
public class TicTacToe implements EntryPoint {

	public static final String Player_X = "X";
	public static final String Player_O = "O";

	public static String[][] currentGame = new String[3][3];
	public static String currentPlayer = Player_X;
	public static String sequenceWinner = null;

	public void onModuleLoad() {

		new HelpInitialization();
	}
}
