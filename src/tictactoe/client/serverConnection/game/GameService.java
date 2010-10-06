package tictactoe.client.serverConnection.game;

import tictactoe.shared.Game;
import tictactoe.shared.Player;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("game")
public interface GameService extends RemoteService {

	Game addPlayer(Player player) throws Exception;

}
