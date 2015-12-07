package org.univnantes.alma.hadl.m1.composants;

import org.univnantes.alma.hadl.m1.ports.fournis.Client_SendRequest;
import org.univnantes.alma.hadl.m1.ports.requis.Client_ReceiveRequest;
import org.univnantes.alma.hadl.m1.services.fournis.Client_SendRequest_Service;
import org.univnantes.alma.hadl.m1.services.requis.Client_ReceiveRequest_Service;
import org.univnantes.alma.hadl.m2.composants.ComposantAtomique;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

public class Client extends ComposantAtomique {

	public Client(String label) {
		super(label);

		this.addPortFournis(new Client_SendRequest("SendRequest",TypeConnexion.CONTINU));
		this.addPortRequis(new Client_ReceiveRequest("ReceiveRequest",TypeConnexion.CONTINU));
		
		this.addServiceFournis(new Client_SendRequest_Service("SendRequest_Service"));
		this.addServiceRequis(new Client_ReceiveRequest_Service("ReceiveRequest_Service"));
	}

}
