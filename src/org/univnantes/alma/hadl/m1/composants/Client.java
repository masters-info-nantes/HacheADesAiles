package org.univnantes.alma.hadl.m1.composants;

import org.univnantes.alma.hadl.m1.ports.fournis.Client_SendRequest;
import org.univnantes.alma.hadl.m1.ports.requis.Client_ReceiveRequest;
import org.univnantes.alma.hadl.m1.services.fournis.Client_SendRequest_Service;
import org.univnantes.alma.hadl.m1.services.requis.Client_ReceiveRequest_Service;
import org.univnantes.alma.hadl.m2.composants.ComposantAtomique;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

import java.util.Observable;

public class Client extends ComposantAtomique {

	public Client(String label) {
		super(label);

		this.addPortFournis(new Client_SendRequest("Client_SendRequest",TypeConnexion.CONTINU));
		this.addPortRequis(new Client_ReceiveRequest("Client_ReceiveRequest",TypeConnexion.CONTINU));
		
		this.addServiceFournis(new Client_SendRequest_Service("Client_SendRequest_Service"));
		this.addServiceRequis(new Client_ReceiveRequest_Service("Client_ReceiveRequest_Service"));
	}

	@Override
	public void update(Observable observable, Object o) {
		if(observable == getPortRequisByLabel("Client_ReceiveRequest")){
			System.out.println("Client receive message :"+o);
		}
	}
}
