package com.codecamp.tictactoe.client;

import com.codecamp.tictactoe.client.help.Help;
import com.codecamp.tictactoe.client.userFeatures.GameBoard;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TicTacToe implements EntryPoint {

	public static String[][] currentGame = new String[3][3];
	public static String currentPlayer = "X";
	public static String sequenceWinner = null;

	public void onModuleLoad() {

		RootPanel.get("gameBoardHtmlTagId").add(helpImage());

		RootPanel.get("gameBoardHtmlTagId").add(new GameBoard());
	}

	private Image helpImage() {

		Image help = new Image("images/help.jpg");

		help.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				new Help();
			}
		});

		return help;
	}
}
