package tictactoe.client.serverCalls.login;

import tictactoe.shared.Player;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {
	public Player login(String requestUri);
}
