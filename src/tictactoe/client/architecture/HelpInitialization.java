package tictactoe.client.architecture;

import helpagile.client.HelpAgileExport;
import helpagile.client.utilities.LoadSpecificationXML;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

/**
 * Loading the contents of the help system.
 * 
 * @architecture
 */
public class HelpInitialization {

	public HelpInitialization() {

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
