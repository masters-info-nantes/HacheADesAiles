package org.univnantes.alma.hadl.m2.interfaces;

import java.util.Observable;

public class RoleRequis extends Role {

	public RoleRequis(String label, TypeConnexion type) {
		super(label,type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof PortFournis){
			System.out.println("Role Requis "+super.getLabel());
			((PortFournis) o).sendRequest((String) arg);
		}
	}

}
