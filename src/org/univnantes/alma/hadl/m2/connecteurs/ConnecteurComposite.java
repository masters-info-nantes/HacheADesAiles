package org.univnantes.alma.hadl.m2.connecteurs;

import java.util.Map;

public class ConnecteurComposite extends Connecteur {

	protected Map<String,Connecteur> connecteurs;
	
	public ConnecteurComposite(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

}
