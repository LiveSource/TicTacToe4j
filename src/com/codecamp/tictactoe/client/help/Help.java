package com.codecamp.tictactoe.client.help;

import java.util.HashMap;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Instructions for the application functions while using the it, to try solve
 * user problems.
 */
public class Help extends DialogBox {

	public static HashMap<String, HelpEntry> helpEntries = new HashMap<String, HelpEntry>();

	public VerticalPanel documentationMenu = new VerticalPanel();
	public static VerticalPanel documentationPanel = new VerticalPanel();

	public Help() {

		this.setSize("600px", "400px");
		this.center();
		this.setText("Help");
		this.setGlassEnabled(true);
		this.setAnimationEnabled(true);
		this.setAutoHideEnabled(true);

		this.setTitle(HelpHint.getHelpHint(this.getClass()));

		VerticalPanel vp = new VerticalPanel();
		vp.setSize("600px", "400px");
		vp.setVerticalAlignment(HasAlignment.ALIGN_TOP);

		HorizontalPanel hp = new HorizontalPanel();

		documentationMenu.clear();
		documentationMenu.setSize("150px", "100%");

		hp.add(documentationMenu);

		documentationMenu.add(showDocumentationMenu());

		documentationPanel.clear();
		documentationPanel.setSize("100%", "100%");
		hp.add(documentationPanel);

		vp.add(hp);

		this.setWidget(vp);

		this.show();
	}

	private VerticalPanel showDocumentationMenu() {

		VerticalPanel vp = new VerticalPanel();

		vp.setSpacing(15);

		Anchor linkFeaturesList = new Anchor("Features List");
		linkFeaturesList.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new ShowFeaturesList();
			}
		});
		vp.add(linkFeaturesList);

		Anchor linkUserManual = new Anchor("User Manual");
		linkUserManual.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new ShowUserManual();
			}
		});
		vp.add(linkUserManual);

		return vp;
	}
}
