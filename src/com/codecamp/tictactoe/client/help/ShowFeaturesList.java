package com.codecamp.tictactoe.client.help;

import java.util.HashMap;
import java.util.Iterator;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * List all the features available for the game.
 */
public class ShowFeaturesList extends VerticalPanel {

	public ShowFeaturesList() {

		Help.documentationPanel.clear();

		this.setSpacing(20);

		HashMap<String, HelpEntry> helpEntries = Help.helpEntries;

		for (Iterator<String> helpKeys = helpEntries.keySet().iterator(); helpKeys
				.hasNext();) {

			String helpKey = (String) helpKeys.next();

			HelpEntry helpEntry = (HelpEntry) helpEntries.get(helpKey);

			if (helpEntry.isFeature()) {

				this.add(getEntryHTML(helpEntry.getFeatureName(),
						helpEntry.getFeatureDescription()));

			}
		}

		Help.documentationPanel.add(this);
	}

	public static HTML getEntryHTML(String featureName,
			String featureDescription) {

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
