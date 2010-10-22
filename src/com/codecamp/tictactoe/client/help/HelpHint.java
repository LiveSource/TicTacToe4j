package com.codecamp.tictactoe.client.help;

public class HelpHint {

	public static String getHelpHint(Class hintClass) {

		return getHelpHint(hintClass.getName());
	}

	public static String getHelpHint(String hintClass) {

		HelpEntry helpEntry = Help.helpEntries.get(hintClass);

		if (helpEntry != null) {

			String description = helpEntry.getFeatureDescription().replaceAll(
					"\n", " ");
			description = description.replaceAll("\t", " ");

			return helpEntry.getFeatureName() + ": \n" + description.trim();

		} else {

			return null;
		}
	}

}
