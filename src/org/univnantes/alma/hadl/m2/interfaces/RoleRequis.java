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
		if(o instanceof PortFournis){
			//System.out.println("From port fournis "+((PortFournis)o).getLabel());
			this.setChanged();
			notifyObservers(arg);
		}else if (o instanceof ConnecteurAtomique){
			//System.out.println("From Connecteur "+((ConnecteurAtomique) o).getLabel());
			this.setChanged();
			notifyObservers(arg);
		} else if (o instanceof ConfigPortFournis) {
			setChanged();
			notifyObservers(arg);
		}
	}

	public void receiveRequest(String message){
		//System.out.println("Role Requis : "+super.getLabel()+", Receive message : "+message);
		this.setChanged();
		notifyObservers(message);
	}
}
