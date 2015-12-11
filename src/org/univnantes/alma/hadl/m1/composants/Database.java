package org.univnantes.alma.hadl.m1.composants;

import org.univnantes.alma.hadl.m1.ports.fournis.QueryD_Fournis;
import org.univnantes.alma.hadl.m1.ports.fournis.Security_Management_Fournis;
import org.univnantes.alma.hadl.m1.ports.requis.QueryD_Requis;
import org.univnantes.alma.hadl.m1.ports.requis.Security_Management_Requis;
import org.univnantes.alma.hadl.m1.services.fournis.QueryD_ServiceFournis;
import org.univnantes.alma.hadl.m1.services.fournis.SecurityManagement_ServiceFournis;
import org.univnantes.alma.hadl.m1.services.requis.QueryD_ServiceRequis;
import org.univnantes.alma.hadl.m1.services.requis.SecurityManagement_ServiceRequis;
import org.univnantes.alma.hadl.m2.composants.ComposantAtomique;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

import java.util.Observable;

public class Database extends ComposantAtomique{

	public Database(String label) {
		super(label);
		
		this.addPortFournis(new QueryD_Fournis("QueryD_Fournis", TypeConnexion.CONTINU));
		this.addPortFournis(new Security_Management_Fournis("SecurityManagement_Fournis", TypeConnexion.CONTINU));
		
		this.addPortRequis(new QueryD_Requis("QueryD_Requis", TypeConnexion.CONTINU));
		this.addPortRequis(new Security_Management_Requis("SecurityManagement_Requis", TypeConnexion.CONTINU));
		
		this.addServiceFournis(new QueryD_ServiceFournis("QueryD_ServiceFournis"));
		this.addServiceFournis(new SecurityManagement_ServiceFournis("SecurityManagement_ServiceFournis"));
		
		this.addServiceRequis(new QueryD_ServiceRequis("QueryD_ServiceRequis"));
		this.addServiceRequis(new SecurityManagement_ServiceRequis("SecurityManagement_ServiceRequis"));
	}


	@Override
	public void update(Observable observable, Object o) {
		System.out.println("Passage dans [Composant] : Database");
		if(observable == getPortRequisByLabel("QueryD_Requis")){
			getPortFournisByLabel("QueryD_Fournis").sendRequest((String) o + " Player1");
		} else if (observable == getPortRequisByLabel("SecurityManagement_Requis")){
			String reponse = ("Bonjour".equals(o)) ? "true" : "false";
			getPortFournisByLabel("SecurityManagement_Fournis").sendRequest(reponse);
		}
	}
}
