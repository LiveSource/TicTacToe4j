package tictactoe.client.serverCalls.game;

import tictactoe.shared.Game;
import tictactoe.shared.Player;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GameServiceAsync {

	void addPlayer(Player player, AsyncCallback<Game> callback);

}
