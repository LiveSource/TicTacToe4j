package tictactoe.client.userInterface;

import helpagile.client.exportation.HelpHint;
import tictactoe.client.Initialization;
import tictactoe.shared.GameEntity;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;







/** 
 * If there is three consecutive marks in a horizontal, vertical, or diagonal
 series, the current Player wins the game, the system highlights the winning
 sequence and the game is over.
 * 
 * @Feature 
 */
public class WinningSequence {

	public static void showWinner(int currentMoveRow, int currentMoveColumn) {

		String marker = "<font size=6 color=\"red\"><b>"
				+ Initialization.currentGame.getCurrentPlayer().getPlayerIcon()
				+ "</b></font>";

		if (Initialization.currentGame.getSequenceWinner().equals(
				GameEntity.SEQUENCE_ROW)) {

			GameBoard.gameGrid.setHTML(currentMoveRow, 0, marker);
			GameBoard.gameGrid.setHTML(currentMoveRow, 1, marker);
			GameBoard.gameGrid.setHTML(currentMoveRow, 2, marker);

		} else if (Initialization.currentGame.getSequenceWinner().equals(
				GameEntity.SEQUENCE_COLUMN)) {

			GameBoard.gameGrid.setHTML(0, currentMoveColumn, marker);
			GameBoard.gameGrid.setHTML(1, currentMoveColumn, marker);
			GameBoard.gameGrid.setHTML(2, currentMoveColumn, marker);

		} else if (Initialization.currentGame.getSequenceWinner().equals(
				GameEntity.SEQUENCE_DIAGONAL_RIGHT)) {

			GameBoard.gameGrid.setHTML(0, 2, marker);
			GameBoard.gameGrid.setHTML(1, 1, marker);
			GameBoard.gameGrid.setHTML(2, 0, marker);

		} else if (Initialization.currentGame.getSequenceWinner().equals(
				GameEntity.SEQUENCE_DIAGONAL_LEFT)) {

			GameBoard.gameGrid.setHTML(0, 0, marker);
			GameBoard.gameGrid.setHTML(1, 1, marker);
			GameBoard.gameGrid.setHTML(2, 2, marker);
		}

		showHelpHint();
	}

	private static void showHelpHint() {

		GameBoard.gameGrid.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				String helpHint = HelpHint
						.getHelpHint("tictactoe.client.userInterface.WinningSequence");

				HTML html = new HTML(helpHint);
				html.setSize("300px", "100px");

				final DecoratedPopupPanel hintPopup = new DecoratedPopupPanel(
						true);
				hintPopup.setSize("300px", "100px");
				hintPopup.setWidget(html);

				Widget source = (Widget) event.getSource();
				int left = source.getAbsoluteLeft() + 10;
				int top = source.getAbsoluteTop() + 10;
				hintPopup.setPopupPosition(left, top);

				hintPopup.show();
			}
		});
	}

}
