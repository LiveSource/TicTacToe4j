package tictactoe;

import tictactoe.shared.Player;

public class PlayersTest {

	public static Player playerO = new Player();

	public static Player playerX = new Player();

	public static Player returnPlayerO() {

		playerO.setPlayerSymbol(Player.PlayerSymbol_O);

		return playerO;
	}

	public static Player returnPlayerX() {

		playerX.setPlayerSymbol(Player.PlayerSymbol_X);

		return playerX;
	}

}
