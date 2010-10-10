package tictactoe.client.serverCalls.login;

import tictactoe.client.authentication.Login;
import tictactoe.client.userFeatures.gameBoard.GamePanel;
import tictactoe.shared.Player;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class LoginCall {

	LoginServiceAsync loginService = GWT.create(LoginService.class);

	public LoginCall() {

		loginService.login(GWT.getHostPageBaseURL(),
				new AsyncCallback<Player>() {

					public void onSuccess(Player player) {

						if (player.isLoggedIn()) {

							new GamePanel(player);

						} else {

							new Login(player);
						}
					}

					public void onFailure(Throwable error) {

						Window.alert(error.getMessage());
					}
				});

	}
}
