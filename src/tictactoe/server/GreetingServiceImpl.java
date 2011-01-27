package tictactoe.server;

import tictactoe.client.serverCalls.GreetingService;
import tictactoe.shared.GameEntity;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 * 
 * @Architecture
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	@Override
	public GameEntity checkForWinner(GameEntity currentGame,
			int currentMoveRow, int currentMoveColumn) {

		return MovimentJudgment.checkForWinner(currentGame, currentMoveRow,
				currentMoveColumn);
	}

}
