package org.univnantes.alma.hadl.m2.interfaces;

import java.util.Observable;

public class PortFournis extends Port {

	public PortFournis(String label, TypeConnexion type) {
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
		System.out.println("Port fournis : "+super.getLabel()+", Message : "+(String)arg);
		if(o instanceof RoleRequis){
			System.out.println("From role requis "+((RoleRequis)o).getLabel());
			this.setChanged();
			notifyObservers(arg);
		}else if(o instanceof ConfigPortFournis){
			System.out.println("From ConfigPort requis "+((ConfigPortRequis)o).getLabel());
			this.setChanged();
			notifyObservers(arg);
		}
	}

	public void sendRequest(String message){
		System.out.println("Port send : "+super.getLabel()+" : "+message);
		this.setChanged();
		notifyObservers(message);
	}
	
}
