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
		
		this.addConnecteur(new RPC("RPCTo"));
		this.addConnecteur(new RPC("RPCFrom"));
		
		this.addAttachement(new Attachement("attachementClientRPC",
				this.getComposantByLabel("Client").getPortFournisByLabel("Client_SendRequest"),
				this.getConnecteurByLabel("RPCTo").getRoleRequisByLabel("fromClient_SendRequest")));
		
		this.addAttachement(new Attachement("attachementServeurRPC",
				((Configuration)this.getComposantByLabel("Serveur")).getConfigPortRequisByLabel("Server_ReceiveRequest"),
				this.getConnecteurByLabel("RPCTo").getRoleFournisByLabel("toServer_ReceiveRequest")));

		this.addAttachement(new Attachement("attachementRPCClient",
				this.getComposantByLabel("Client").getPortRequisByLabel("Client_ReceiveRequest"),
				this.getConnecteurByLabel("RPCFrom").getRoleFournisByLabel("toClient_ReceiveRequest")));

		this.addAttachement(new Attachement("attachementRPCServeur",
				((Configuration)this.getComposantByLabel("Serveur")).getConfigPortFournisByLabel("Server_SendRequest"),
				this.getConnecteurByLabel("RPCFrom").getRoleRequisByLabel("fromServer_SendRequest")));
	}

	public void run(){
		this.getComposantByLabel("Client").getPortFournisByLabel("Client_SendRequest").sendRequest("Bonjour");
	}
}
