package tictactoe.client.serverCalls;

import tictactoe.client.GameInitialization;
import tictactoe.client.userInterface.PlayerMove;
import tictactoe.client.userInterface.WinningSequence;
import tictactoe.shared.GameEntity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;



/** 
 * 
 *  
 */
public class CheckWinner {

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private static final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	public static void checkForWinner(GameEntity currentGame,
			final int currentMoveRow, final int currentMoveColumn) {

		greetingService.checkForWinner(currentGame, currentMoveRow,
				currentMoveColumn, new AsyncCallback<GameEntity>() {

					public void onSuccess(GameEntity gameReturned) {

						if (gameReturned.getSequenceWinner() != null) {

							GameInitialization.currentGameStatus
									.setSequenceWinner(gameReturned
											.getSequenceWinner());

							WinningSequence.showWinner(currentMoveRow,
									currentMoveColumn);
						} else {

							PlayerMove.toggleCurrentPlayer();
						}
					}

					public void onFailure(Throwable caught) {

						Window.alert(caught.toString());
					}
				});

	}

}
