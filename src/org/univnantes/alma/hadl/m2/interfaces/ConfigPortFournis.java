package org.univnantes.alma.hadl.m2.interfaces;

import java.util.Observable;

public class ConfigPortFournis extends ConfigPort {

	public ConfigPortFournis(String label, TypeConnexion type) {
		super(label, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable observable, Object o) {
		System.out.println("ConfigPort fournis : "+super.getLabel()+", Message : "+(String)o);
		if(observable instanceof RoleRequis){
			System.out.println("From role requis "+super.getLabel());
			this.setChanged();
			notifyObservers(o);
		}else if(observable instanceof PortRequis){
			System.out.println("From port requis "+super.getLabel());
			this.setChanged();
			notifyObservers(o);
		}else if(observable instanceof PortFournis){
			System.out.println("From port fournis "+ ((PortFournis) observable).getLabel());
			this.setChanged();
			notifyObservers(o);
		}
	}
}
