package org.univnantes.alma.hadl.m2.interfaces;

import java.util.Observable;

public class PortRequis extends Port {

	public PortRequis(String label, TypeConnexion type) {
		super(label,type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PortFournis [label=" + super.getLabel() + "]";
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof RoleFournis){
			System.out.println("Port requis"+super.getLabel());
		}
	}
	
	public void receiveRequest(String message){
		System.out.println("Receive "+ message);
		this.setChanged();
		notifyObservers();
	}
}
