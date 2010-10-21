package com.codecamp.tictactoe.client.help;

public class HelpHint {

	public static String getHelpHint(Class hintClass) {

		return getHelpHint(hintClass.getName());
	}

	public static String getHelpHint(String hintClass) {

		HelpEntry helpEntry = Help.helpEntries.get(hintClass);

		if (helpEntry != null) {

			return helpEntry.getFeatureName() + " - "
					+ helpEntry.getFeatureDescription().trim();
		} else {

			return null;
		}
	}

}
