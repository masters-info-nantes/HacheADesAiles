package org.univnantes.alma.hadl.m1.configurations;

import org.univnantes.alma.hadl.m1.composants.ConnexionManager;
import org.univnantes.alma.hadl.m1.composants.Database;
import org.univnantes.alma.hadl.m1.composants.SecurityManager;
import org.univnantes.alma.hadl.m1.connecteurs.ClearanceRequest;
import org.univnantes.alma.hadl.m1.connecteurs.SQLQuery;
import org.univnantes.alma.hadl.m1.connecteurs.SecurityQuery;
import org.univnantes.alma.hadl.m1.ports.fournis.Server_SendRequest;
import org.univnantes.alma.hadl.m1.ports.requis.Server_ReceiveRequest;
import org.univnantes.alma.hadl.m1.services.fournis.Server_SendRequest_Service;
import org.univnantes.alma.hadl.m1.services.requis.Server_ReceiveRequest_Service;
import org.univnantes.alma.hadl.m2.composants.Configuration;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

public class Serveur extends Configuration {

	public Serveur(String label) {
		super(label);

		this.addComposant(new SecurityManager("SecurityManager"));
		this.addComposant(new ConnexionManager("ConnexionManager"));
		this.addComposant(new Database("Database"));
		
		this.addConnecteur(new ClearanceRequest("ClearanceRequest"));
		this.addConnecteur(new SQLQuery("SQLQuery"));
		this.addConnecteur(new SecurityQuery("SecurityQuery"));
		
		this.addConfigPortRequis(new Server_ReceiveRequest("ReceiveRequest",TypeConnexion.CONTINU));
		this.addConfigPortFournis(new Server_SendRequest("SendRequest",TypeConnexion.CONTINU));
		
		this.addServiceRequis(new Server_ReceiveRequest_Service("ReceiveRequest_Service"));
		this.addServiceFournis(new Server_SendRequest_Service("SendRequest_Service"));
	}

}
