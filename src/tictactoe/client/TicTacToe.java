package tictactoe.client;

import helpagile.client.HelpAgile;

import com.google.gwt.core.client.EntryPoint;



/** 
 * Entry point classes define <code>onModuleLoad()</code>.
 * 
 * @architecture 
 */
public class TicTacToe implements EntryPoint {

	public static String[][] currentGame = new String[3][3];
	public static String currentPlayer = "X";
	public static String sequenceWinner = null;

	public void onModuleLoad() {

		HelpAgile.initHelp("/help/TicTacToe_Specification.xml");

		new GameInitialization();
	}

}
