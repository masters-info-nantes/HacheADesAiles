package org.univnantes.alma.hadl.m2.connecteurs;

import java.util.Set;

public class ConnecteurComposite extends Connecteur {

	protected Set<Connecteur> connecteurs;
	
	public ConnecteurComposite(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

}
