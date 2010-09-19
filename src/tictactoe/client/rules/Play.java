package tictactoe.client.rules;

import tictactoe.client.StartGame;

/**
 * Logic that realizes a player move.
 */
public class Play {

	public static String doPlay(int row, int column) {

		String sign = "<font size=6><b>" + StartGame.player + "</b></font>";

		if (StartGame.player.equals("O")) {

			StartGame.player = "X";
		} else {

			StartGame.player = "O";
		}

		return sign;
	}

}
