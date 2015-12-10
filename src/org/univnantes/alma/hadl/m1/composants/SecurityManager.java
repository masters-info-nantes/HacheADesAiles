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

import java.util.Observable;

public class SecurityManager extends ComposantAtomique {

	public SecurityManager(String label) {
		super(label);
		
		this.addPortFournis(new SecurityAuth_Fournis("SecurityAuth_Fournis",TypeConnexion.CONTINU));
		this.addPortFournis(new CheckQuery_Fournis("CheckQuery_Fournis",TypeConnexion.CONTINU));
		
		this.addPortRequis(new SecurityAuth_Requis("SecurityAuth_Requis",TypeConnexion.CONTINU));
		this.addPortRequis(new CheckQuery_Requis("CheckQuery_Requis",TypeConnexion.CONTINU));
		
		this.addServiceFournis(new SecurityAuth_ServiceFournis("SecurityAuth_ServiceFournis"));
		this.addServiceFournis(new CheckQuery_ServiceFournis("CheckQueryAuth_ServiceFournis"));
		
		this.addServiceRequis(new SecurityAuth_ServiceRequis("SecurityAuth_ServiceRequis"));
		this.addServiceRequis(new CheckQuery_ServiceRequis("CheckQuery_ServiceRequis"));
	}

	@Override
	public void update(Observable observable, Object o) {
		System.out.println("Passage dans SecurityManager");
		if(observable ==  getPortRequisByLabel("SecurityAuth_Requis")){
			if("Bonjour".equals(o)) {
				getPortFournisByLabel("CheckQuery_Fournis").sendRequest((String) o);
			}else {
				getPortFournisByLabel("SecurityAuth_Fournis").sendRequest("false");
			}
		}else if (observable == getPortFournisByLabel("CheckQuery_Requis")){
			getPortFournisByLabel("SecurityAuth_Fournis").sendRequest((String) o);
		}
	}
}
