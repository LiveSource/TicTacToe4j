package tictactoe.server;

import tictactoe.client.serverConnection.login.LoginService;
import tictactoe.shared.Player;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImplementation extends RemoteServiceServlet implements
		LoginService {

	private static final long serialVersionUID = 1L;

	public Player login(String requestUri) {

		UserService userService = UserServiceFactory.getUserService();

		User user = userService.getCurrentUser();

		Player player = new Player();

		if (user != null) {

			player.setLoggedIn(true);
			player.setEmailAddress(user.getEmail());
			player.setNickname(user.getNickname());
			player.setLogoutUrl(userService.createLogoutURL(requestUri));

		} else {

			player.setLoggedIn(false);
			player.setLoginUrl(userService.createLoginURL(requestUri));
		}
		return player;
	}

}
