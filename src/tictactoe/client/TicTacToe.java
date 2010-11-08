package tictactoe.client;

import helpagile.client.HelpAgileExport;
import helpagile.client.utilities.LoadSpecificationXML;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TicTacToe implements EntryPoint {

	public static String[][] currentGame = new String[3][3];
	public static String currentPlayer = "X";
	public static String sequenceWinner = null;

	public void onModuleLoad() {

		initHelp();
	}

	private void initHelp() {

		RequestCallback requestCallback = new RequestCallback() {

			public void onResponseReceived(Request request, Response response) {

				LoadSpecificationXML.convertHelpEntries(response.getText());

				new GameInitialization();
			}

			public void onError(Request request, Throwable exception) {

				Window.alert("Failed to send the message: "
						+ exception.getMessage());
			}

		};

		HelpAgileExport
				.initHelp("TicTacToe_Specification.xml", requestCallback);

	}
}
