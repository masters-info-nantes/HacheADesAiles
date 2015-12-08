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
import org.univnantes.alma.hadl.m2.autres.Attachement;
import org.univnantes.alma.hadl.m2.autres.Binding;
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
		
		this.addConfigPortRequis(new Server_ReceiveRequest("Server_ReceiveRequest",TypeConnexion.CONTINU));
		this.addConfigPortFournis(new Server_SendRequest("Server_SendRequest",TypeConnexion.CONTINU));
		
		this.addServiceRequis(new Server_ReceiveRequest_Service("Server_ReceiveRequest_Service"));
		this.addServiceFournis(new Server_SendRequest_Service("Server_SendRequest_Service"));
		
		
		this.addAttachement(new Attachement("attSecuClearance_To", 
											this.getComposantByLabel("SecurityManager").getPortRequisByLabel("SecurityAuth_Requis"), 
											this.getConnecteurByLabel("ClearanceRequest").getRoleFournisByLabel("toSecurityAuth")));
		
		this.addAttachement(new Attachement("attSecuSecu_To", 
											this.getComposantByLabel("SecurityManager").getPortRequisByLabel("CheckQuery_Requis"), 
											this.getConnecteurByLabel("SecurityQuery").getRoleFournisByLabel("toCheckQuery")));
		
		this.addAttachement(new Attachement("attSecuClearance_From", 
											this.getComposantByLabel("SecurityManager").getPortFournisByLabel("SecurityAuth_Fournis"), 
											this.getConnecteurByLabel("ClearanceRequest").getRoleRequisByLabel("fromSecurityAuth")));
		
		this.addAttachement(new Attachement("attSecuSecu_From", 
											this.getComposantByLabel("SecurityManager").getPortFournisByLabel("CheckQuery_Fournis"), 
											this.getConnecteurByLabel("SecurityQuery").getRoleRequisByLabel("fromCheckQuery")));
		
		
		this.addAttachement(new Attachement("attConnClearance_To", 
											this.getComposantByLabel("ConnexionManager").getPortRequisByLabel("SecurityCheck_Requis"), 
											this.getConnecteurByLabel("ClearanceRequest").getRoleFournisByLabel("toSecurityCheck")));
		
		this.addAttachement(new Attachement("attConnSQL_To", 
											this.getComposantByLabel("ConnexionManager").getPortRequisByLabel("DBQuery_Requis"), 
											this.getConnecteurByLabel("SQLQuery").getRoleFournisByLabel("toDBQuery")));
		
		this.addAttachement(new Attachement("attConnClearance_From", 
											this.getComposantByLabel("ConnexionManager").getPortFournisByLabel("SecurityCheck_Fournis"), 
											this.getConnecteurByLabel("ClearanceRequest").getRoleRequisByLabel("fromSecurityCheck")));
		
		this.addAttachement(new Attachement("attConnSQL_From", 
											this.getComposantByLabel("ConnexionManager").getPortFournisByLabel("DBQuery_Fournis"), 
											this.getConnecteurByLabel("SQLQuery").getRoleRequisByLabel("fromDBQuery")));
		
		
		this.addAttachement(new Attachement("attDataSecu_To", 
											this.getComposantByLabel("Database").getPortRequisByLabel("QueryD_Requis"), 
											this.getConnecteurByLabel("SQLQuery").getRoleFournisByLabel("toQueryD")));

		this.addAttachement(new Attachement("attDataSQL_To", 
											this.getComposantByLabel("Database").getPortRequisByLabel("SecurityManagement_Requis"), 
											this.getConnecteurByLabel("SecurityQuery").getRoleFournisByLabel("toSecurityManagement")));

		this.addAttachement(new Attachement("attDataSecu_From", 
											this.getComposantByLabel("Database").getPortFournisByLabel("QueryD_Fournis"), 
											this.getConnecteurByLabel("SQLQuery").getRoleRequisByLabel("fromQueryD")));

		this.addAttachement(new Attachement("attSQL_From", 
											this.getComposantByLabel("Database").getPortFournisByLabel("SecurityManagement_Fournis"), 
											this.getConnecteurByLabel("SecurityQuery").getRoleRequisByLabel("fromSecurityManagement")));
		
		this.addBinding(new Binding("bindConnServeur", 
						this.getComposantByLabel("ConnexionManager").getPortRequisByLabel("ExternalSocket_Requis"), 
						this.getConfigPortFournisByLabel("Server_SendRequest")));
		
		this.addBinding(new Binding("bindServeurConn", 
				this.getComposantByLabel("ConnexionManager").getPortFournisByLabel("ExternalSocket_Fournis"), 
				this.getConfigPortRequisByLabel("Server_ReceiveRequest")));

	}

}
