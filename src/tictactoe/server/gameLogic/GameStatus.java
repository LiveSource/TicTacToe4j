package tictactoe.server.gameLogic;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import tictactoe.shared.Game;

public class GameStatus {

	public static Game getGameStatus(PersistenceManager persistenceManager) {

		Query q = persistenceManager.newQuery(Game.class);

		List<Game> games = (List<Game>) q.execute();

		Game game = games.get(0);

		return game;
	}

}
