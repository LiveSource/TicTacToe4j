package com.codecamp.tictactoe.client.help;

import java.util.HashMap;
import java.util.Iterator;

import com.google.gwt.user.client.ui.HTML;
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

			HTML entryHTML = ShowFeaturesList.getEntryHTML(
					helpEntry.getFeatureName(),
					helpEntry.getFeatureDescription());

			entryHTML.setHTML(entryHTML.getHTML() + "<br>"
					+ entryMethods(helpEntry.getMethods()));

			this.add(entryHTML);
		}

		Help.documentationPanel.add(this);
	}

	private static String entryMethods(final HelpMethod[] methods) {

		String methodsText = "";

		for (int i = 0; i < methods.length; i++) {

			HelpMethod method = methods[i];

			if (method.getDescription() != null
					&& !method.getDescription().equals("")) {

				methodsText += "<blockquote>" + method.getDescription()
						+ "</blockquote>";
			}
		}

		return methodsText;
	}

}
