package org.univnantes.alma.hadl.m0;

import org.univnantes.alma.hadl.m1.configurations.ClientServeur;
import org.univnantes.alma.hadl.m2.composants.Composant;
import org.univnantes.alma.hadl.m2.interfaces.Port;

public class HacheADesAiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientServeur CS = new ClientServeur("ClientServer");
		for(Composant c : CS.getComposants()){
			System.out.println(c);
			for(Port p : c.getPortsfournis()){
				System.out.println(p);
			}
			for(Port p : c.getPortsrequis()){
				System.out.println(p);
			}
		}
		
	}

}
