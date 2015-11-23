package org.univnantes.alma.hadl.m2.interfaces;

public abstract class PointConnexion extends Interface{
	
	private TypeConnexion type;
	
	public PointConnexion(String label,TypeConnexion type){
		super(label);
		this.type = type;
	}
	public TypeConnexion getType() {
		return type;
	}
	public void setType(TypeConnexion type) {
		this.type = type;
	}
	
}
