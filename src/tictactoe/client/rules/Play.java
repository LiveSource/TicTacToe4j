package tictactoe.client.rules;

import tictactoe.client.SystemInitialization;

/**
 * Logic that realizes a player move.
 */
public class Play {

	public static String doPlay(int row, int column) {

		String sign = "<font size=6><b>" + SystemInitialization.player
				+ "</b></font>";

		if (SystemInitialization.player.equals("O")) {

			SystemInitialization.player = "X";
		} else {

			SystemInitialization.player = "O";
		}

		return sign;
	}

}
