package org.univnantes.alma.hadl.m1.connecteurs;

import org.univnantes.alma.hadl.m1.roles.Called;
import org.univnantes.alma.hadl.m1.roles.Caller;
import org.univnantes.alma.hadl.m2.connecteurs.Connecteur;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

public class RPC extends Connecteur {

	public RPC(String label) {
		super(label);

		this.setGlue(new RPC_Glue());
		this.add(new Called("toServer_ReceiveRequest",TypeConnexion.CONTINU));
		this.add(new Caller("fromClient_SendRequest",TypeConnexion.CONTINU));
	}

}
