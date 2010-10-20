package com.codecamp.tictactoe.client.help;

import java.util.ArrayList;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.NodeList;
import com.google.gwt.xml.client.XMLParser;

/**
 * List all the features available for the game.
 */
public class ShowUserManual extends VerticalPanel {

	private static final String ENTRY = "entry";
	private static final String FEATURE = "feature";
	private static final String CLASS_NAME = "className";
	private static final String CLASS_PATH = "classPath";
	private static final String FEATURE_NAME = "featureName";
	private static final String DESCRIPTION = "description";

	public ShowUserManual(String xmlContent) {

		this.setSpacing(20);

		for (HTML html : getFeaturesList(xmlContent)) {

			this.add(html);
		}

	}

	public static ArrayList<HTML> getFeaturesList(String xmlContent) {

		Document xmlDoc = XMLParser.parse(xmlContent);
		Element root = xmlDoc.getDocumentElement();
		XMLParser.removeWhitespace(xmlDoc);

		NodeList entries = root.getElementsByTagName(ENTRY);

		ArrayList<HTML> htmlArray = new ArrayList<HTML>();

		for (int i = 0; i < entries.getLength(); i++) {

			Element entry = (Element) entries.item(i);

			Element featureName = (Element) entry.getElementsByTagName(
					FEATURE_NAME).item(0);

			Element description = (Element) entry.getElementsByTagName(
					DESCRIPTION).item(0);

			htmlArray.add(ShowUserManual
					.getFeature(featureName.getFirstChild().getNodeValue(),
							description.getFirstChild().getNodeValue()));

		}

		return htmlArray;
	}

	public static HTML getFeature(String featureName, String featureDescription) {

		String name = "<br><B>" + featureName + "</B> ";

		String description = "<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <FONT SIZE=1>"
				+ featureDescription + "</FONT>";

		HTML html = new HTML(name + description);

		html.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent sender) {

			}
		});

		return html;
	}

}
