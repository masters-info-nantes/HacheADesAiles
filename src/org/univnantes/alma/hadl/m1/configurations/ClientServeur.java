package org.univnantes.alma.hadl.m1.configurations;

import org.univnantes.alma.hadl.m1.composants.Client;
import org.univnantes.alma.hadl.m1.connecteurs.RPC;
import org.univnantes.alma.hadl.m2.autres.Attachement;
import org.univnantes.alma.hadl.m2.composants.Configuration;

public class ClientServeur extends Configuration {

	public ClientServeur(String label) {
		super(label);
		
		this.addComposant(new Client("Client"));
		this.addComposant(new Serveur("Serveur"));
		
		this.addConnecteur(new RPC("RPC"));
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("Client").getPortFournisByLabel("Client_SendRequest"), 
												this.getConnecteurByLabel("RPC").getRoleRequisByLabel("fromClient_SendRequest")));
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("Serveur").getPortRequisByLabel("Server_ReceiveRequest"), 
												this.getConnecteurByLabel("RPC").getRoleFournisByLabel("toServer_ReceiveRequest")));
	}

}
