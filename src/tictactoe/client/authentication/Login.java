package tictactoe.client.authentication;

import tictactoe.shared.User;

import com.google.gwt.user.client.Window;

/**
 * Insert user authentication and login into the game.
 * 
 * @todo
 */
public class Login {

	public Login(User user) {

		Window.Location.assign(user.getLoginUrl());

	}
}