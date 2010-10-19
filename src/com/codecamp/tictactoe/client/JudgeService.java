package com.codecamp.tictactoe.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class JudgeService {

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private static final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	public static void checkForWinner(String[][] currentGame) {

		greetingService.checkForWinner(currentGame,
				new AsyncCallback<String>() {
					public void onFailure(Throwable caught) {

					}

					public void onSuccess(String result) {

						// Window.alert(result);
					}
				});

	}

}
