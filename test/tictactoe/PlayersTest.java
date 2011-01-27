package tictactoe;

import tictactoe.shared.Player;

public class PlayersTest {

	public static Player playerO = new Player();

	public static Player playerX = new Player();

	public static Player returnPlayerO() {

		playerO.setPlayerIcon(Player.PlayerIcon_O);

		return playerO;
	}

	public static Player returnPlayerX() {

		playerX.setPlayerIcon(Player.PlayerIcon_X);

		return playerX;
	}

}
