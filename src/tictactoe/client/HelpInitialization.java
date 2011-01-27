package tictactoe.client;

import helpagile.client.HelpAgileExport;
import helpagile.client.exportation.HelpWindow;
import helpagile.client.utilities.ConvertSpecificationXML;
import tictactoe.client.userInterface.GameBoard;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Loading the contents of the help system.
 * 
 * @Architecture
 */
public class HelpInitialization {

	public HelpInitialization() {

		RequestCallback requestCallback = new RequestCallback() {

			public void onResponseReceived(Request request, Response response) {

				ConvertSpecificationXML.convertHelpEntries(response.getText());

				RootPanel.get("gameBoardHtmlTagId").add(
						HelpWindow.helpIcon("TicTacToe"));

				RootPanel.get("gameBoardHtmlTagId").add(new GameBoard());
			}

			public void onError(Request request, Throwable exception) {

				Window.alert("Failed to send the message: "
						+ exception.getMessage());
			}

		};

		HelpAgileExport.initHelp("TicTacToe", requestCallback);

	}
}
