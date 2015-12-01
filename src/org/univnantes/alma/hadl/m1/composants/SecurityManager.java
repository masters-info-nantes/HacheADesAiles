package org.univnantes.alma.hadl.m1.composants;

import org.univnantes.alma.hadl.m1.ports.fournis.CheckQuery_Fournis;
import org.univnantes.alma.hadl.m1.ports.fournis.SecurityAuth_Fournis;
import org.univnantes.alma.hadl.m1.ports.requis.CheckQuery_Requis;
import org.univnantes.alma.hadl.m1.ports.requis.SecurityAuth_Requis;
import org.univnantes.alma.hadl.m1.services.fournis.CheckQuery_ServiceFournis;
import org.univnantes.alma.hadl.m1.services.fournis.SecurityAuth_ServiceFournis;
import org.univnantes.alma.hadl.m1.services.requis.CheckQuery_ServiceRequis;
import org.univnantes.alma.hadl.m1.services.requis.SecurityAuth_ServiceRequis;
import org.univnantes.alma.hadl.m2.composants.ComposantAtomique;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

public class SecurityManager extends ComposantAtomique {

	public SecurityManager(String label) {
		super(label);
		
		this.add(new SecurityAuth_Fournis("SecurityAuth_Fournis",TypeConnexion.CONTINU));
		this.add(new CheckQuery_Fournis("CheckQuery_Fournis",TypeConnexion.CONTINU));
		
		this.add(new SecurityAuth_Requis("SecurityAuth_Requis",TypeConnexion.CONTINU));
		this.add(new CheckQuery_Requis("CheckQuery_Requis",TypeConnexion.CONTINU));
		
		this.add(new SecurityAuth_ServiceFournis("SecurityAuth_ServiceFournis"));
		this.add(new CheckQuery_ServiceFournis("CheckQueryAuth_ServiceFournis"));
		
		this.add(new SecurityAuth_ServiceRequis("SecurityAuth_ServiceRequis"));
		this.add(new CheckQuery_ServiceRequis("CheckQuery_ServiceRequis"));
	}

}
