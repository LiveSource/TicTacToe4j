package tictactoe.client.rules;

import tictactoe.client.TicTacToe;
import tictactoe.shared.Game;

/**
 * Realizes a player move.
 * 
 * @feature
 */
public class Play {

	public static String doPlay(int row, int column) {

		String sign = "<font size=6><b>" + TicTacToe.gameStatus.getNextPlayer()
				+ "</b></font>";

		if (TicTacToe.gameStatus.getNextPlayer().equals(Game.PLAYER_O)) {

			TicTacToe.gameStatus.setNextPlayer(Game.PLAYER_X);
		} else {

			TicTacToe.gameStatus.setNextPlayer(Game.PLAYER_O);
		}

		return sign;
	}

}
