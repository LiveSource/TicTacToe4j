package tictactoe.client.serverConnection.login;

import tictactoe.client.GameStart;
import tictactoe.client.authentication.Login;
import tictactoe.shared.User;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class LoginCall {

	LoginServiceAsync loginService = GWT.create(LoginService.class);

	public LoginCall() {

		loginService.login(GWT.getHostPageBaseURL(), new AsyncCallback<User>() {

			public void onSuccess(User result) {
				User user = result;

				if (user.isLoggedIn()) {

					new GameStart(user);

				} else {

					new Login(user);
				}
			}

			public void onFailure(Throwable error) {

				Window.alert(error.getMessage());
			}
		});

	}
}
