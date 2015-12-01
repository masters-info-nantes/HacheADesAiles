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

public class Database extends ComposantAtomique{

	public Database(String label) {
		super(label);
		
		this.add(new QueryD_Fournis("QueryD_Fournis", TypeConnexion.CONTINU));
		this.add(new Security_Management_Fournis("SecurityManagement_Fournis", TypeConnexion.CONTINU));
		
		this.add(new QueryD_Requis("QueryD_Requis", TypeConnexion.CONTINU));
		this.add(new Security_Management_Requis("SecurityManagement_Requis", TypeConnexion.CONTINU));
		
		this.add(new QueryD_ServiceFournis("QueryD_ServiceFournis"));
		this.add(new SecurityManagement_ServiceFournis("SecurityManagement_ServiceFournis"));
		
		this.add(new QueryD_ServiceRequis("QueryD_ServiceRequis"));
		this.add(new SecurityManagement_ServiceRequis("SecurityManagement_ServiceRequis"));
	}

}
