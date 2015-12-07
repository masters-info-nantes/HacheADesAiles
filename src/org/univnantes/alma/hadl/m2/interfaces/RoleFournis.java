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
		if(o instanceof PortRequis){
			System.out.println("roleFournis"+super.getLabel());
		}
	}

}
