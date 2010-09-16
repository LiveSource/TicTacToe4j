package tictactoe.client;

import com.google.gwt.user.client.ui.Grid;

/**
 *  3x3 table that contains the game board.
 */
public class GameGrid extends Grid {

	public GameGrid() {

		super(3, 3);

		this.setSize("300px", "300px");
		this.setBorderWidth(1);
	}

}
