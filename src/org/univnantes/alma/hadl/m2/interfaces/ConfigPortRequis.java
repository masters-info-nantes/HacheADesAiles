package org.univnantes.alma.hadl.m2.interfaces;

import java.util.Observable;

public class ConfigPortRequis extends ConfigPort {

	public ConfigPortRequis(String label, TypeConnexion type) {
		super(label, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable observable, Object o) {
		System.out.println("ConfigPort requis : "+super.getLabel()+", Message : "+(String)o);
		if(observable instanceof RoleFournis){
			System.out.println("From role fournis "+((RoleFournis)observable).getLabel());
			this.setChanged();
			notifyObservers(o);
		}else if(observable instanceof PortFournis){
			System.out.println("From port fournis "+super.getLabel());
			this.setChanged();
			notifyObservers(o);
		}
	}
}
