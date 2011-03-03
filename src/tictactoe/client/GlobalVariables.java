package tictactoe.client;

import tictactoe.shared.GameEntity;
import tictactoe.shared.Player;

public class GlobalVariables {

	public static GameEntity currentGameStatus = new GameEntity();

	public static boolean waitingMoveFlag = false;

	public static Player playerO = new Player();

	public static Player playerX = new Player();

}
