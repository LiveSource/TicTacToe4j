package tictactoe.client.authentication;

import tictactoe.shared.User;

import com.google.gwt.user.client.ui.Anchor;

public class Logout extends Anchor {

	public Logout(User user) {

		this.setText("Log out");

		this.setHref(user.getLogoutUrl());

	}
}