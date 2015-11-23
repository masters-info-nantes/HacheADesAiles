package org.univnantes.alma.hadl.m2.interfaces;

public abstract class Interface {
	
	private String label;
	
	public Interface (String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
