package tictactoe.server;

import tictactoe.client.architecture.GreetingService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;



/** 
 * The server side implementation of the RPC service.
 * 
 * @architecture 
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	@Override
	public String checkForWinner(String[][] gameStatus, int currentMoveRow,
			int currentMoveColumn) {

		return MovimentJudgment.checkForWinner(gameStatus, currentMoveRow,
				currentMoveColumn);
	}

}
