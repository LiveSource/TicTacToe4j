package tictactoe.server;

import tictactoe.client.serverConnection.login.LoginService;
import tictactoe.shared.User;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {

	public User login(String requestUri) {

		UserService userService = UserServiceFactory.getUserService();

		com.google.appengine.api.users.User user = userService.getCurrentUser();

		User loginInfo = new User();

		if (user != null) {

			loginInfo.setLoggedIn(true);
			loginInfo.setEmailAddress(user.getEmail());
			loginInfo.setNickname(user.getNickname());
			loginInfo.setLogoutUrl(userService.createLogoutURL(requestUri));

		} else {

			loginInfo.setLoggedIn(false);
			loginInfo.setLoginUrl(userService.createLoginURL(requestUri));
		}
		return loginInfo;
	}

}
