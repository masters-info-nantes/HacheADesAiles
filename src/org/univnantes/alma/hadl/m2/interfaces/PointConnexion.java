package org.univnantes.alma.hadl.m2.interfaces;

public abstract class PointConnexion extends Interface{
	
	private TypeConnexion type;
	
	public PointConnexion(TypeConnexion type){
		this.type = type;
	}
	public TypeConnexion getType() {
		return type;
	}
	public void setType(TypeConnexion type) {
		this.type = type;
	}
	
}
