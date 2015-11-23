package org.univnantes.alma.hadl.m2.autres;

public abstract class Propriete {
	private String label;
	private String value;
	
	public Propriete(String label, String value) {
		super();
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public String getValue() {
		return value;
	}
	
}
