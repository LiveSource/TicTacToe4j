package tictactoe.client.serverCalls.login;

import tictactoe.shared.Player;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {
	public void login(String requestUri, AsyncCallback<Player> async);
}
