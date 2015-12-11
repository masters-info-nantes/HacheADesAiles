package org.univnantes.alma.hadl.m2.interfaces;

import java.util.Observable;

import org.univnantes.alma.hadl.m2.connecteurs.ConnecteurAtomique;


public class RoleFournis extends Role {

	public RoleFournis(String label, TypeConnexion type) {
		super(label,type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Role Fournis : "+super.getLabel()+", Message : "+(String) arg);
		
		if(o instanceof PortRequis){
			//System.out.println("From port requis "+((PortRequis) o).getLabel());
			this.setChanged();
			notifyObservers(arg);
		}else if(o instanceof ConnecteurAtomique){
			//System.out.println("From Connecteur "+((ConnecteurAtomique) o).getLabel());
			this.setChanged();
			notifyObservers(arg);
		}
	}

	public void sendRequest(String message){
		//System.out.println("Role Fourni : "+super.getLabel()+", Send message : "+message);
		this.setChanged();
		notifyObservers(message);
	}
}
