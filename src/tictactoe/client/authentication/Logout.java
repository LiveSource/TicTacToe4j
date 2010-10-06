package tictactoe.client.authentication;

import tictactoe.shared.Player;

import com.google.gwt.user.client.ui.Anchor;

public class Logout extends Anchor {

	public Logout(Player player) {

		this.setText("Log out");

		this.setHref(player.getLogoutUrl());

	}
}