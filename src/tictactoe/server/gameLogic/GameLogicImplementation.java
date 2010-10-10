package tictactoe.server.gameLogic;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import tictactoe.client.serverCalls.game.GameService;
import tictactoe.shared.Game;
import tictactoe.shared.Player;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class GameLogicImplementation extends RemoteServiceServlet implements
		GameService {

	private static final long serialVersionUID = 1L;

	private static final PersistenceManagerFactory PMF = JDOHelper
			.getPersistenceManagerFactory("transactions-optional");

	@Override
	public Game addPlayer(Player player) throws Exception {

		Game game = null;

		PersistenceManager persistenceManager = PMF.getPersistenceManager();

		try {

			game = AddPlayer.add(player, persistenceManager);

		} catch (Exception e) {

			throw e;

		} finally {

			persistenceManager.close();
		}

		return game;
	}

}
