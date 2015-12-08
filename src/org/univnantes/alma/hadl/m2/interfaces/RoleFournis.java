package org.univnantes.alma.hadl.m2.interfaces;

import java.util.Observable;


public class RoleFournis extends Role {

	public RoleFournis(String label, TypeConnexion type) {
		super(label,type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Role Fournis : "+super.getLabel()+", Message : "+(String) arg);
		this.setChanged();
		notifyObservers(arg);
		if(o instanceof PortRequis){
			System.out.println("From port requis "+((PortRequis) o).getLabel());
		}
	}

	public void sendRequest(String message){
		System.out.println(super.getLabel()+" : "+message);
		//this.setChanged();
		notifyObservers(message);
	}
}
