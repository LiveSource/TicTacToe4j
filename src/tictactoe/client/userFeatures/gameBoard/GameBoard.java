package tictactoe.client.userFeatures.gameBoard;

import tictactoe.client.help.Help;
import tictactoe.client.serverCalls.game.AddPlayer;
import tictactoe.shared.Player;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * The web page that shows the game.
 * 
 */
public class GameBoard extends VerticalPanel {

	public static VerticalPanel vpPlayerO = new VerticalPanel();

	public static VerticalPanel vpPlayerX = new VerticalPanel();

	public GameBoard(Player player) {

		this.setSize("100%", "100%");

		this.setSpacing(15);

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(helpImage());

		this.add(new GameGrid());

		this.add(vpPlayerO);

		this.add(vpPlayerX);

		RootPanel.get().setSize("100%", "100%");

		RootPanel.get().add(this);

		new AddPlayer(player);

	}

	private Image helpImage() {

		Image help = new Image("images/help.jpg");

		help.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new Help();
			}
		});

		return help;
	}

}
