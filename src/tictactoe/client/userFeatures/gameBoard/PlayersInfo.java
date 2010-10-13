package tictactoe.client.userFeatures.gameBoard;

import tictactoe.client.authentication.Logout;
import tictactoe.shared.Game;
import tictactoe.shared.Player;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;





/** 
 * Show the current players name in the game panel. Test 2 
 *  
 */

public class PlayersInfo extends HorizontalPanel {

	public PlayersInfo(Game gameStatus, Player player) {

		Label playerNickName = null;

		if (gameStatus.getNextPlayer().equals(Game.PLAYER_O)) {

			playerNickName = new Label("Player O : "
					+ gameStatus.getPlayerONickName());
		} else {

			playerNickName = new Label("Player X : "
					+ gameStatus.getPlayerXNickName());
		}

		this.setSpacing(20);

		this.add(playerNickName);

		this.add(new Logout(player));

	}
}
