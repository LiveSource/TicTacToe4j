package tictactoe.client.architecture;

import helpagile.client.exportation.HelpIcon;
import tictactoe.client.userInterface.GameBoard;

import com.google.gwt.user.client.ui.RootPanel;

/**
 * System preparation for the game initialization.
 * 
 * @architecture
 */
public class GameInitialization {

	public GameInitialization() {

		RootPanel.get("gameBoardHtmlTagId").add(
				new HelpIcon("TicTacToe"));

		RootPanel.get("gameBoardHtmlTagId").add(new GameBoard());
	}

}
