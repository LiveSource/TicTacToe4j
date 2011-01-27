package tictactoe.client.serverCalls;

import tictactoe.shared.GameEntity;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 * 
 * @Architecture
 */
public interface GreetingServiceAsync {

	void checkForWinner(GameEntity currentGame, int currentMoveRow,
			int currentMoveColumn, AsyncCallback<GameEntity> callback);
}
