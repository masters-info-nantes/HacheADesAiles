package org.univnantes.alma.hadl.m1.composants;

import org.univnantes.alma.hadl.m1.ports.fournis.DBQuery_Fournis;
import org.univnantes.alma.hadl.m1.ports.fournis.ExternalSocket_Fournis;
import org.univnantes.alma.hadl.m1.ports.fournis.SecurityCheck_Fournis;
import org.univnantes.alma.hadl.m1.ports.requis.DBQuery_Requis;
import org.univnantes.alma.hadl.m1.ports.requis.ExternalSocket_Requis;
import org.univnantes.alma.hadl.m1.ports.requis.SecurityCheck_Requis;
import org.univnantes.alma.hadl.m1.services.fournis.DBQuery_ServiceFournis;
import org.univnantes.alma.hadl.m1.services.fournis.SecurityCheck_ServiceFournis;
import org.univnantes.alma.hadl.m1.services.requis.DBQuery_ServiceRequis;
import org.univnantes.alma.hadl.m1.services.requis.SecurityCheck_ServiceRequis;
import org.univnantes.alma.hadl.m2.composants.ComposantAtomique;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

public class ConnexionManager extends ComposantAtomique{

	public ConnexionManager(String label) {
		super(label);
		
		this.addPortFournis(new SecurityCheck_Fournis("SecurityCheck_Fournis", TypeConnexion.CONTINU));
		this.addPortFournis(new DBQuery_Fournis("DBQuery_Fournis", TypeConnexion.CONTINU));
		this.addPortFournis(new ExternalSocket_Fournis("ExternalSocket_Fournis", TypeConnexion.CONTINU));
		
		this.addPortRequis(new SecurityCheck_Requis("SecurityCheck_Requis", TypeConnexion.CONTINU));
		this.addPortRequis(new DBQuery_Requis("DBQuery_Requis", TypeConnexion.CONTINU));
		this.addPortRequis(new ExternalSocket_Requis("ExternalSocket_Requis", TypeConnexion.CONTINU));
		
		this.addServiceFournis(new SecurityCheck_ServiceFournis("SecurityCheck_ServiceFournis"));
		this.addServiceFournis(new DBQuery_ServiceFournis("DBQuery_ServiceFournis"));
		
		this.addServiceRequis(new SecurityCheck_ServiceRequis("SecurityCheck_ServiceRequis"));
		this.addServiceRequis(new DBQuery_ServiceRequis("DBQuery_ServiceRequis"));
	}

}
