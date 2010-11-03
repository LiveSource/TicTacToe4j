package tictactoe.server;

import tictactoe.client.GreetingService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	@Override
	public String checkForWinner(String[][] gameStatus, int currentMoveRow,
			int currentMoveColumn) {

		return Judge.checkForWinner(gameStatus, currentMoveRow,
				currentMoveColumn);
	}

}
