package tictactoe.client.userFeatures;

import helpagile.client.visualizationWidgets.HelpHint;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;

/**
 * 3x3 grid of cells in which players enter a mark to indicate their desired
 * move.
 */
public class GameGrid extends Grid {

	public GameGrid() {

		super(3, 3);

		this.setBorderWidth(1);
		this.setSize("400px", "400px");

		this.setTitle("test Title");

		formatGridCells();

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				Cell cell = getCellForEvent(event);

				makeMove(cell);

			}
		});

		this.setTitle(HelpHint.getHelpHint(this.getClass()));
	}

	private void makeMove(Cell cell) {
		PlayerMove.makeMove(this, cell);

	}

	private void formatGridCells() {

		CellFormatter formatter = new CellFormatter();

		for (int row = 0; row < 3; row++) {

			for (int column = 0; column < 3; column++) {

				formatter.setWidth(row, column, "33%");
				formatter.setHeight(row, column, "33%");

				formatter.setHorizontalAlignment(row, column,
						HasHorizontalAlignment.ALIGN_CENTER);
				formatter.setVerticalAlignment(row, column,
						HasVerticalAlignment.ALIGN_MIDDLE);

				this.setCellFormatter(formatter);
			}
		}
	}
}
