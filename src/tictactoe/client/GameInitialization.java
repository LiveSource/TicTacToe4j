package tictactoe.client;

import tictactoe.shared.GameEntity;
import tictactoe.shared.Player;

public class GameInitialization {

	public static GameEntity currentGameStatus = new GameEntity();
	public static boolean waitingMoveFlag = false;

	public static Player playerO = new Player();

	public static Player playerX = new Player();

	public GameInitialization() {

		initializeUsers();
	}

	private void initializeUsers() {

		playerO.setPlayerIcon(Player.PlayerIcon_O);

		playerX.setPlayerIcon(Player.PlayerIcon_X);

		currentGameStatus.setCurrentPlayer(playerX);

		currentGameStatus.setGameMoves(new Player[3][3]);
	}
}
