package com.codecamp.tictactoe.client.help;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;

/**
 * Open a window with the help instructions for this application.
 */
public class HelpIcon extends Image {

	public HelpIcon() {

		this.setUrl("images/help.jpg");

		this.setTitle(HelpHint.getHelpHint(this.getClass()));

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new Help();
			}
		});
	}
}
