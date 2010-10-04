package tictactoe.client;

import tictactoe.client.rules.Play;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;

/**
 * 3x3 table that contains the game board.
 */
public class GameGrid extends Grid {

	public GameGrid() {

		super(3, 3);

		this.setSize("320px", "320px");
		this.setBorderWidth(1);

		final String gridText = this.getText(0, 0);

		this.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				Cell cell = getCellForEvent(event);

				String text = getText(cell.getRowIndex(), cell.getCellIndex());

				if (gridText.equals(text)) {

					setCellFormatter(formatCell(cell.getRowIndex(),
							cell.getCellIndex()));

					setHTML(cell.getRowIndex(), cell.getCellIndex(), Play
							.doPlay(cell.getRowIndex(), cell.getCellIndex()));
				}

			}
		});

	}

	public CellFormatter formatCell(int row, int column) {

		CellFormatter formatter = new CellFormatter();

		formatter.setWidth(row, column, "33%");
		formatter.setHeight(row, column, "33%");

		formatter.setHorizontalAlignment(row, column,
				HasHorizontalAlignment.ALIGN_CENTER);
		formatter.setVerticalAlignment(row, column,
				HasVerticalAlignment.ALIGN_MIDDLE);

		return formatter;
	}

}
