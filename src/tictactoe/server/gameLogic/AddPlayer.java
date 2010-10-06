package tictactoe.server.gameLogic;

import javax.jdo.PersistenceManager;

import tictactoe.shared.Game;
import tictactoe.shared.Player;

public class AddPlayer {

	public static Game add(Player player, PersistenceManager persistenceManager) {

		Game game = null;

		game = GameStatus.getGameStatus(persistenceManager);

		if (game.getNextPlayer().equals(Game.PLAYER_O)) {

			game.setPlayerONickName(player.getNickname());
			game.setNextPlayer(Game.PLAYER_X);

		} else {

			game.setPlayerXNickName(player.getNickname());
			game.setNextPlayer(Game.PLAYER_O);
		}

		persistenceManager.makePersistent(game);

		return game;
	}

}
