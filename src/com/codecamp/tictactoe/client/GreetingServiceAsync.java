package com.codecamp.tictactoe.client;

import com.google.gwt.user.client.rpc.AsyncCallback;





/** 
 * The async counterpart of <code>GreetingService</code>.
 * 
 * @architecture 
 */
public interface GreetingServiceAsync {

	void checkForWinner(String[][] gameStatus, int currentMoveRow,
			int currentMoveColumn, AsyncCallback<String> callback);
}
