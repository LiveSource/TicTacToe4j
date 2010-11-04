package tictactoe.client;

import helpagile.client.exportation.HelpIcon;
import tictactoe.client.userInterface.GameBoard;

import com.google.gwt.user.client.ui.RootPanel;

public class GameInitialization {

	public GameInitialization() {

		RootPanel.get("gameBoardHtmlTagId").add(
				new HelpIcon("TicTacToe_Specification.xml"));

		RootPanel.get("gameBoardHtmlTagId").add(new GameBoard());
	}

}
