package tictactoe.client;

import tictactoe.client.userInterface.GameBoard;
import helpagile.client.visualizationWidgets.HelpIcon;

import com.google.gwt.user.client.ui.RootPanel;

public class GameInitialization {

	public GameInitialization() {

		RootPanel.get("gameBoardHtmlTagId").add(new HelpIcon());

		RootPanel.get("gameBoardHtmlTagId").add(new GameBoard());
	}

}
