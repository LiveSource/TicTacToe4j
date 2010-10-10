package tictactoe.client;

import tictactoe.client.serverCalls.login.LoginCall;
import tictactoe.shared.Game;

/**
 * Start point for the application.
 * 
 */
public class TicTacToe {

	public static Game gameStatus = new Game();

	public void onModuleLoad() {

		new LoginCall();

	}
}
