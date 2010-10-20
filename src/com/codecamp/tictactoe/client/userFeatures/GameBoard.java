package com.codecamp.tictactoe.client.userFeatures;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * The Game Board is the web page where the game is shown. The Game Board
 * accommodates the game grid and also some options such as a restart button,
 * help, game score, game status, ...
 */
public class GameBoard extends VerticalPanel {

	public static GameGrid gameGrid = new GameGrid();

	public GameBoard() {

		this.setSize("100%", "100%");
		this.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(gameGrid);
	}
}
