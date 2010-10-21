package com.codecamp.tictactoe.client.help;

import java.io.Serializable;

public class HelpEntry implements Serializable {

	private static final long serialVersionUID = 1L;

	private String filePath;

	private String fileName;

	private boolean feature;

	private boolean specification;

	private String featureName;

	private String featureDescription;

	private HelpMethod[] methods;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean isFeature() {
		return feature;
	}

	public void setFeature(boolean feature) {
		this.feature = feature;
	}

	public boolean isSpecification() {
		return specification;
	}

	public void setSpecification(boolean specification) {
		this.specification = specification;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getFeatureDescription() {
		return featureDescription;
	}

	public void setFeatureDescription(String featureDescription) {
		this.featureDescription = featureDescription;
	}

	public HelpMethod[] getMethods() {
		return methods;
	}

	public void setMethods(HelpMethod[] methods) {
		this.methods = methods;
	}

}
