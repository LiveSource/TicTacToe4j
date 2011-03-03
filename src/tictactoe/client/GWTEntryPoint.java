package tictactoe.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Anchor class to init the system by the Google Web Toolkit (EntryPoint).
 * 
 * @Architecture
 */
public class GWTEntryPoint implements EntryPoint {

	public void onModuleLoad() {

		new GameInitialization();

		new HelpInitialization();
	}
}
