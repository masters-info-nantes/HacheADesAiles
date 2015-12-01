package org.univnantes.alma.hadl.m1.composants;

import org.univnantes.alma.hadl.m1.ports.fournis.DBQuery_Fournis;
import org.univnantes.alma.hadl.m1.ports.fournis.SecurityCheck_Fournis;
import org.univnantes.alma.hadl.m1.ports.requis.DBQuery_Requis;
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
		
		this.add(new SecurityCheck_Fournis("Securityheck_Fournis", TypeConnexion.CONTINU));
		this.add(new DBQuery_Fournis("DQQuery_Fournis", TypeConnexion.CONTINU));
		
		this.add(new SecurityCheck_Requis("Securityheck_Requis", TypeConnexion.CONTINU));
		this.add(new DBQuery_Requis("DQQuery_Requis", TypeConnexion.CONTINU));
		
		this.add(new SecurityCheck_ServiceFournis("SecurityCheck_ServiceFournis"));
		this.add(new DBQuery_ServiceFournis("DBQuery_ServiceFournis"));
		
		this.add(new SecurityCheck_ServiceRequis("SecurityCheck_ServiceRequis"));
		this.add(new DBQuery_ServiceRequis("DBQuery_ServiceRequis"));
	}

}
