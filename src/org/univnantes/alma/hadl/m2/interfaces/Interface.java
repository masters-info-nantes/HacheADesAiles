package org.univnantes.alma.hadl.m2.interfaces;

import java.util.Observable;
import java.util.Observer;

public abstract class Interface extends Observable implements Observer{
	
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

	@Override
	public String toString() {
		return "Interface [label=" + label + "]";
	}
	
	
}
