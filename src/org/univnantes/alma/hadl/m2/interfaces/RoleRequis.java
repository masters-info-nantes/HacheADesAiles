package org.univnantes.alma.hadl.m2.interfaces;

import java.util.Observable;

import org.univnantes.alma.hadl.m2.connecteurs.ConnecteurAtomique;


public class RoleRequis extends Role {

	public RoleRequis(String label, TypeConnexion type) {
		super(label,type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Role Requis : "+super.getLabel()+", Message : "+(String) arg);
		this.setChanged();
		notifyObservers(arg);
		if(o instanceof PortFournis){
			System.out.println("From port fournis "+((PortFournis)o).getLabel());
		}else if (o instanceof ConnecteurAtomique){
			System.out.println("POET");
		}
	}

	public void receiveRequest(String message){
		System.out.println(super.getLabel()+" : "+message);
		//this.setChanged();
		notifyObservers(message);
	}
}
