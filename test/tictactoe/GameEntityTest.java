package tictactoe;

import tictactoe.shared.GameEntity;
import tictactoe.shared.Player;

public class GameEntityTest {

	public static GameEntity returnGameEntity() {

		GameEntity gameEntity = new GameEntity();

		Player[][] gameStatus = new Player[3][3];

		Player playerO = new Player();

		Player playerX = new Player();

		playerO.setPlayerSymbol(Player.PlayerSymbol_O);

		playerX.setPlayerSymbol(Player.PlayerSymbol_X);

		gameStatus[0][0] = playerX;
		gameStatus[0][1] = playerO;

		gameStatus[1][1] = playerX;

		gameEntity.setGameMoves(gameStatus);

		return gameEntity;
	}

}
