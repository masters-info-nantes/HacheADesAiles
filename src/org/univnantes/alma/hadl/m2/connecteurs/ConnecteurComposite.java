package org.univnantes.alma.hadl.m2.connecteurs;

import java.util.HashSet;
import java.util.Set;

public class ConnecteurComposite extends Connecteur {

	protected Set<Connecteur> connecteurs;
	
	public ConnecteurComposite(String label) {
		super(label);
		this.connecteurs = new HashSet<Connecteur>();
	}

	public boolean add(Connecteur arg0) {
		return connecteurs.add(arg0);
	}
	
}
