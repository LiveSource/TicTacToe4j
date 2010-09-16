package tictactoe.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Prepare the system to initialize the game and show the game grid.
 */
public class SystemInitialization implements EntryPoint {

	public void onModuleLoad() {

		RootPanel.get().setSize("100%", "100%");

		VerticalPanel vp = new VerticalPanel();
		vp.setSize("100%", "100%");
		vp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		vp.add(new GameGrid());

		RootPanel.get().add(vp);

	}
}
