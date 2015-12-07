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
		
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("SecurityManager").getPortRequisByLabel("SecurityAuth_Requis"), 
												this.getConnecteurByLabel("SecurityQuery").getRoleFournisByLabel("toSecurityAuth")));
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("SecurityManager").getPortRequisByLabel("CheckQuery_Requis"), 
												this.getConnecteurByLabel("ClearanceRequest").getRoleFournisByLabel("toCheckQuery")));
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("SecurityManager").getPortFournisByLabel("SecurityAuth_fournis"), 
												this.getConnecteurByLabel("SecurityQuery").getRoleRequisByLabel("fromSecurityAuth")));
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("SecurityManager").getPortRequisByLabel("CheckQuery_Fournis"), 
												this.getConnecteurByLabel("ClearanceRequest").getRoleFournisByLabel("fromCheckQuery")));
		
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("ConnexionManager").getPortRequisByLabel("SecurityCheck_Requis"), 
												this.getConnecteurByLabel("ClearanceRequest").getRoleFournisByLabel("toSecurityCheck")));
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("ConnexionManager").getPortRequisByLabel("DBQuery_Requis"), 
												this.getConnecteurByLabel("SQLQuery").getRoleFournisByLabel("toDBQuery")));
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("ConnexionManager").getPortFournisByLabel("SecurityCheck_Fournis"), 
												this.getConnecteurByLabel("ClearanceRequest").getRoleRequisByLabel("fromSecurityCheck")));
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("ConnexionManager").getPortFournisByLabel("DBQuery_Fournis"), 
												this.getConnecteurByLabel("SQLQuery").getRoleRequisByLabel("fromDBQuery")));
		
		
		this.addAttachement(new Attachement("", this.getComposantByLabel("Database").getPortRequisByLabel("QueryD_Requis"), 
												this.getConnecteurByLabel("SecurityQuery").getRoleFournisByLabel("toQueryD")));

		this.addAttachement(new Attachement("", this.getComposantByLabel("Database").getPortRequisByLabel("SecurityManagement_Requis"), 
												this.getConnecteurByLabel("SQLQuery").getRoleFournisByLabel("toSecurityManagement")));

		this.addAttachement(new Attachement("", this.getComposantByLabel("Database").getPortFournisByLabel("QueryD_Fournis"), 
												this.getConnecteurByLabel("SecurityQuery").getRoleRequisByLabel("fromQueryD")));

		this.addAttachement(new Attachement("", this.getComposantByLabel("Database").getPortFournisByLabel("SecutityManagement_Fournis"), 
												this.getConnecteurByLabel("SQLQuery").getRoleRequisByLabel("fromSecurityManagement")));

	}

}
