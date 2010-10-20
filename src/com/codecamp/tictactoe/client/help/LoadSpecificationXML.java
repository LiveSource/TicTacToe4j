package com.codecamp.tictactoe.client.help;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;

public class LoadSpecificationXML {

	public static void loadXMLFile(final boolean isFeatureList) {

		RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET,
				"/help/Specification.xml");

		try {
			requestBuilder.sendRequest(null, new RequestCallback() {

				public void onResponseReceived(Request request,
						Response response) {

					Help.documentationPanel.clear();

					if (isFeatureList) {

						Help.documentationPanel.add(new ShowFeaturesList(
								response.getText()));
					} else {

						Help.documentationPanel.add(new ShowUserManual(response
								.getText()));
					}
				}

				public void onError(Request request, Throwable exception) {

					Window.alert("Failed to send the message: "
							+ exception.getMessage());
				}

			});

		} catch (RequestException ex) {

			Window.alert("Failed to send the message: " + ex.getMessage());
		}
	}

}
