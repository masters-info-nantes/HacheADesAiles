package org.univnantes.alma.hadl.m1.configurations;

import org.univnantes.alma.hadl.m1.composants.Client;
import org.univnantes.alma.hadl.m1.connecteurs.RPC;
import org.univnantes.alma.hadl.m2.composants.Configuration;

public class ClientServeur extends Configuration {

	public ClientServeur(String label) {
		super(label);
		
		this.addComposant(new Client("Client"));
		this.addComposant(new Serveur("Serveur"));
		
		this.addConnecteur(new RPC("RPC"));
	}

}
