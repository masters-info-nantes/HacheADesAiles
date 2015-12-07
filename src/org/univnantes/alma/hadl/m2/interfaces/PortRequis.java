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
		
	}
	
	public void receiveRequest(){
		System.out.println("Receive");
	}
}
