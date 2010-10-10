package tictactoe.client.serverCalls.game;

import tictactoe.client.TicTacToe;
import tictactoe.client.userFeatures.gameBoard.GamePanel;
import tictactoe.client.userFeatures.gameBoard.PlayersInfo;
import tictactoe.shared.Game;
import tictactoe.shared.Player;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HorizontalPanel;

/**
 * Prepare the system to initialize the game and show the game grid.
 * 
 * @feature
 */
public class AddPlayer {

	GameServiceAsync gameService = GWT.create(GameService.class);

	public AddPlayer(final Player player) {

		gameService.addPlayer(player, new AsyncCallback<Game>() {

			public void onSuccess(Game gameStatus) {

				TicTacToe.gameStatus = gameStatus;

				HorizontalPanel hpPlayerInfo = new PlayersInfo(gameStatus,
						player);

				if (gameStatus.getNextPlayer().equals(Game.PLAYER_O)) {

					GamePanel.vpPlayerO.add(hpPlayerInfo);
				} else {

					GamePanel.vpPlayerX.add(hpPlayerInfo);
				}
			}

			public void onFailure(Throwable error) {

				Window.alert(error.getMessage());
			}
		});

	}
}
