package com.codecamp.tictactoe.client.userFeatures;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Lays out a new empty game board.
 */
public class GameBoard extends VerticalPanel {

	public GameBoard() {
		this.setSize("100%", "100%");
		this.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(new GameGrid());
	}
}
