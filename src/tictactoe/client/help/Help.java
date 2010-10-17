package tictactoe.client.help;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Help {

	public VerticalPanel documentationMenu = new VerticalPanel();
	public static VerticalPanel documentationPanel = new VerticalPanel();

	public Help() {

		DialogBox dialogBox = new DialogBox();

		dialogBox.setSize("600px", "500px");
		dialogBox.center();
		dialogBox.setText("Help");
		dialogBox.setGlassEnabled(true);
		dialogBox.setAnimationEnabled(true);
		dialogBox.setAutoHideEnabled(true);

		VerticalPanel vp = new VerticalPanel();

		HorizontalPanel hp = new HorizontalPanel();

		documentationMenu.clear();
		documentationMenu.setSize("150px", "100%");

		hp.add(documentationMenu);

		documentationMenu.add(showDocumentationMenu());

		documentationPanel.clear();
		documentationPanel.setSize("100%", "100%");
		hp.add(documentationPanel);

		vp.add(hp);

		dialogBox.setWidget(vp);

		dialogBox.show();
	}

	private VerticalPanel showDocumentationMenu() {

		VerticalPanel vp = new VerticalPanel();

		vp.setSpacing(15);

		Anchor linkFeaturesList = new Anchor("Features List");
		linkFeaturesList.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				LoadFeaturesList.loadXMLFile();
			}
		});
		vp.add(linkFeaturesList);

		Anchor linkUserManual = new Anchor("User Manual");
		linkUserManual.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

			}
		});
		vp.add(linkUserManual);

		return vp;
	}
}
