package com.codecamp.tictactoe.client;

import com.codecamp.tictactoe.client.help.HelpIcon;
import com.codecamp.tictactoe.client.userFeatures.GameBoard;
import com.google.gwt.user.client.ui.RootPanel;

public class GameInitialization {

	public GameInitialization() {

		RootPanel.get("gameBoardHtmlTagId").add(new HelpIcon());

		RootPanel.get("gameBoardHtmlTagId").add(new GameBoard());
	}

}
