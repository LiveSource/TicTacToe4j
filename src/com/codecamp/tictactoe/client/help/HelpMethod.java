package com.codecamp.tictactoe.client.help;

import java.io.Serializable;

public class HelpMethod implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private String spacedName;

	private String returnType;

	private String parameters;

	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getSpacedName() {
		return spacedName;
	}

	public void setSpacedName(String spacedName) {
		this.spacedName = spacedName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return name + "(" + parameters + ")";
	}

}
