package com.codecamp.tictactoe.client.help;

import java.util.HashMap;
import java.util.Iterator;

import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * List all the help entries available for the game.
 */
public class ShowUserManual extends VerticalPanel {

	public ShowUserManual() {

		Help.documentationPanel.clear();

		this.setSpacing(20);

		HashMap<String, HelpEntry> helpEntries = Help.helpEntries;

		for (Iterator<String> helpKeys = helpEntries.keySet().iterator(); helpKeys
				.hasNext();) {

			String helpKey = (String) helpKeys.next();

			HelpEntry helpEntry = (HelpEntry) helpEntries.get(helpKey);

			this.add(ShowFeaturesList.getEntryHTML(helpEntry.getFeatureName(),
					helpEntry.getFeatureDescription()));
		}

		Help.documentationPanel.add(this);
	}

}
