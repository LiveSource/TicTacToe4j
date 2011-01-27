package tictactoe.client;

import tictactoe.shared.GameEntity;
import tictactoe.shared.Player;

public class Initialization {

	public static GameEntity currentGame = new GameEntity();
	public static boolean waitingFlag = false;

	public static Player playerO = new Player();

	public static Player playerX = new Player();

	public Initialization() {

		initializeUsers();
	}

	private void initializeUsers() {

		playerO.setPlayerIcon(Player.PlayerIcon_O);

		playerX.setPlayerIcon(Player.PlayerIcon_X);

		currentGame.setCurrentPlayer(playerX);

		currentGame.setGameMoves(new Player[3][3]);
	}
}
