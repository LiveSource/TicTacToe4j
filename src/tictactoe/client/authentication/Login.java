package tictactoe.client.authentication;

import tictactoe.shared.Player;

import com.google.gwt.user.client.Window;

/**
 * Insert user authentication and login into the game.
 * 
 * @todo
 */
public class Login {

	public Login(Player user) {

		Window.Location.assign(user.getLoginUrl());

	}
}