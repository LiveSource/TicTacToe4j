package tictactoe.client.userInterface;

import helpagile.client.exportation.HelpHint;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * The web page where the game is shown. Accommodates the game grid and also
 * some options such as a restart button, help, game score, game status, ...
 */
public class GameBoard extends VerticalPanel {

	public static GameGrid gameGrid = new GameGrid();

	public GameBoard() {

		this.setSize("100%", "100%");

		this.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(gameGrid);

		this.setTitle(HelpHint.getHelpHint(this.getClass()));
	}

}
