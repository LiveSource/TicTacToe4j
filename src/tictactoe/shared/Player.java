package tictactoe.shared;

import java.io.Serializable;

/**
 * Information about each player of the game.
 * 
 * @Entity
 */
public class Player implements Serializable {

	public static final String PlayerIcon_X = "X";
	public static final String PlayerIcon_O = "O";

	private String name;

	private String email;

	private String playerIcon;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlayerIcon() {
		return playerIcon;
	}

	public void setPlayerIcon(String playerIcon) {
		this.playerIcon = playerIcon;
	}

}
