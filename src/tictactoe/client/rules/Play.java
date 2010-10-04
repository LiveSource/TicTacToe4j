package tictactoe.client.rules;

import tictactoe.client.GameStart;

/**
 * Realizes a player move.
 * 
 * @feature
 */
public class Play {

	public static String doPlay(int row, int column) {

		String sign = "<font size=6><b>" + GameStart.player + "</b></font>";

		if (GameStart.player.equals("O")) {

			GameStart.player = "X";
		} else {

			GameStart.player = "O";
		}

		return sign;
	}

}
