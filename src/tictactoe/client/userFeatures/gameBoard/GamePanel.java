package tictactoe.client.userFeatures.gameBoard;

import tictactoe.client.serverCalls.game.AddPlayer;
import tictactoe.shared.Player;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/** 
 * The web page that the game appears.
 *  
 */

public class GamePanel extends VerticalPanel {

	public static VerticalPanel vpPlayerO = new VerticalPanel();

	public static VerticalPanel vpPlayerX = new VerticalPanel();

	public GamePanel(Player player) {

		this.setSize("100%", "100%");

		this.setSpacing(10);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(new GameGrid());

		this.add(vpPlayerO);

		this.add(vpPlayerX);

		RootPanel.get().setSize("100%", "100%");

		RootPanel.get().add(this);

		new AddPlayer(player);

	}

}
