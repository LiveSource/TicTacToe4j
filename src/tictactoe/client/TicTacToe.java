package tictactoe.client;

import tictactoe.client.serverConnection.login.LoginCall;

/**
 * Start point for the application.
 * 
 */
public class TicTacToe {

	public void onModuleLoad() {

		new LoginCall();

	}
}
