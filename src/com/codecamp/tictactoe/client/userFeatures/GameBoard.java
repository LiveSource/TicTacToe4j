package com.codecamp.tictactoe.client.userFeatures;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * The web page where the game is shown. Accommodates the game grid and also
 * some options such as a restart button, help, game score, game status, ...
 */
public class GameBoard extends VerticalPanel {

	public static GameGrid gameGrid = new GameGrid();

	public GameBoard() {

		this.setSize("100%", "100%");
		this.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		this.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

		this.add(gameGrid);

		showHelpHint();

	}

	private void showHelpHint() {

		this.addHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub

				Window.alert("test");

				final DecoratedPopupPanel simplePopup = new DecoratedPopupPanel(
						true);
				simplePopup.setWidth("150px");
				simplePopup.setWidget(new HTML("test"));
				simplePopup.show();
			}
		}, ClickEvent.getType());
	}
}
