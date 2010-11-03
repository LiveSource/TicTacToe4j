package tictactoe.client;

import tictactoe.client.userFeatures.PlayerMove;
import tictactoe.client.userFeatures.WinningSequence;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class JudgeService {

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private static final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	public static void checkForWinner(String[][] currentGame,
			final int currentMoveRow, final int currentMoveColumn) {

		greetingService.checkForWinner(currentGame, currentMoveRow,
				currentMoveColumn, new AsyncCallback<String>() {

					public void onSuccess(String sequenceWinner) {

						if (sequenceWinner != null) {

							TicTacToe.sequenceWinner = sequenceWinner;

							WinningSequence.showWinner(currentMoveRow, currentMoveColumn,
									sequenceWinner);
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
