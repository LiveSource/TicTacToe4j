package tictactoe.client;

import tictactoe.client.authentication.Logout;
import tictactoe.shared.User;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Prepare the system to initialize the game and show the game grid.
 * 
 * @feature
 */
public class GameStart extends VerticalPanel {

	public static String player = "O";

	public GameStart(User user) {

		this.setSize("100%", "100%");

		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(new GameGrid());

		this.add(userInfo(user));

		RootPanel.get().setSize("100%", "100%");

		RootPanel.get().add(this);

	}

	private HorizontalPanel userInfo(User user) {

		HorizontalPanel hp = new HorizontalPanel();

		hp.setSpacing(20);

		hp.add(new Label(user.getNickname()));

		hp.add(new Logout(user));

		return hp;
	}

}
