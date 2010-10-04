package tictactoe.client.serverConnection.login;

import tictactoe.shared.User;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {
	public void login(String requestUri, AsyncCallback<User> async);
}
