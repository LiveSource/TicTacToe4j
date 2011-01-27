package tictactoe.client.serverCalls;

import tictactoe.shared.GameEntity;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 * 
 * @Architecture
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {

	GameEntity checkForWinner(GameEntity currentGame, int currentMoveRow,
			int currentMoveColumn);
}
