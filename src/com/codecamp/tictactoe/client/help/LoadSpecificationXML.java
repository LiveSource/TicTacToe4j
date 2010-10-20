package com.codecamp.tictactoe.client.help;

import java.util.HashMap;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.NodeList;
import com.google.gwt.xml.client.XMLParser;

public class LoadSpecificationXML {

	private static final String ENTRY = "entry";
	private static final String FEATURE = "feature";
	private static final String CLASS_NAME = "className";
	private static final String CLASS_PATH = "classPath";
	private static final String FEATURE_NAME = "featureName";
	private static final String FEATURE_DESCRIPTION = "featureDescription";

	public static void loadXMLFile() {

		RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET,
				"/help/Specification.xml");

		try {
			requestBuilder.sendRequest(null, new RequestCallback() {

				public void onResponseReceived(Request request,
						Response response) {

					Help.helpEntries = convertHelpHashMap(response.getText());

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

	public static HashMap<String, HelpEntry> convertHelpHashMap(
			String xmlContent) {

		Document xmlDoc = XMLParser.parse(xmlContent);
		Element root = xmlDoc.getDocumentElement();
		XMLParser.removeWhitespace(xmlDoc);

		NodeList entries = root.getElementsByTagName(ENTRY);

		HashMap<String, HelpEntry> helpEntries = new HashMap<String, HelpEntry>();

		for (int i = 0; i < entries.getLength(); i++) {

			Element entryElement = (Element) entries.item(i);

			HelpEntry helpEntry = new HelpEntry();

			helpEntry.setFeature(Boolean.parseBoolean(entryElement
					.getAttribute(FEATURE)));

			helpEntry.setFeatureName(entryElement
					.getElementsByTagName(FEATURE_NAME).item(0).toString());

			Element featureDescriptionElement = (Element) entryElement
					.getElementsByTagName(FEATURE_DESCRIPTION).item(0);

			if (featureDescriptionElement != null) {

				helpEntry.setFeatureDescription(featureDescriptionElement
						.toString());
			}

			String entryKey = entryElement.getElementsByTagName(CLASS_PATH)
					.item(0).toString()
					+ "."
					+ entryElement.getElementsByTagName(CLASS_NAME).item(0)
							.toString();

			helpEntries.put(entryKey, helpEntry);
		}

		return helpEntries;
	}
}
