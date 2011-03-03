package tictactoe.client;

import tictactoe.shared.Player;

public class GameInitialization {

	public GameInitialization() {

		GlobalVariables.playerO.setPlayerSymbol(Player.PlayerSymbol_O);

		GlobalVariables.playerX.setPlayerSymbol(Player.PlayerSymbol_X);

		GlobalVariables.currentGameStatus
				.setCurrentPlayer(GlobalVariables.playerX);

		GlobalVariables.currentGameStatus.setGameMoves(new Player[3][3]);
	}
}
