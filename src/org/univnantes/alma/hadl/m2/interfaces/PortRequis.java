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
		System.out.println("Port requis : "+super.getLabel()+", Message : "+(String)arg);
		if(o instanceof RoleFournis){
			//System.out.println("From role fournis "+((RoleFournis)o).getLabel());
			this.setChanged();
			notifyObservers(arg);
		}else if(o instanceof  ConfigPortRequis){
			//System.out.println("From config port requis"+((ConfigPortRequis) o).getLabel());
			this.setChanged();
			notifyObservers(arg);
		}
	}
	
	public void receiveRequest(String message){
		System.out.println("Port Requis : "+super.getLabel()+", Receive message : "+ message);
		this.setChanged();
		notifyObservers(message);
	}
}
