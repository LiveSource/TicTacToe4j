package com.codecamp.tictactoe.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {

	void checkForWinner(String[][] gameStatus, AsyncCallback<String> callback);
}