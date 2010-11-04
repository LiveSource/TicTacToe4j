package tictactoe.client;

import helpagile.client.visualizationWidgets.HelpHint;
import tictactoe.client.userInterface.GameBoard;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;

public class GameInitialization {

	public GameInitialization() {

		RootPanel.get("gameBoardHtmlTagId").add(
				HelpIcon("TicTacToe_Specification.xml"));

		RootPanel.get("gameBoardHtmlTagId").add(new GameBoard());
	}

	public Image HelpIcon(final String helpFile) {

		Image helpIcon = new Image();

		helpIcon.setUrl("images/help.jpg");

		helpIcon.setTitle(HelpHint.getHelpHint(this.getClass()));

		helpIcon.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				Window.open(
						"http://helpagile.appspot.com/?xmlFile=" + helpFile,
						"_blank", "width=1000 height=600");
			}
		});

		return helpIcon;
	}

}
