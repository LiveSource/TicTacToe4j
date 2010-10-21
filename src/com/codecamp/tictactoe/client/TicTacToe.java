package com.codecamp.tictactoe.client;

import com.codecamp.tictactoe.client.help.LoadSpecificationXML;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TicTacToe implements EntryPoint {

	public static String[][] currentGame = new String[3][3];
	public static String currentPlayer = "X";
	public static String sequenceWinner = null;

	public void onModuleLoad() {

		LoadSpecificationXML.loadXMLFile();
	}

}
