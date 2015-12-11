package org.univnantes.alma.hadl.m1.connecteurs;

import org.univnantes.alma.hadl.m1.roles.Called;
import org.univnantes.alma.hadl.m1.roles.Caller;
import org.univnantes.alma.hadl.m2.connecteurs.ConnecteurAtomique;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

public class RPC extends ConnecteurAtomique {

	public RPC(String label) {
		super(label);

		this.setGlue(new RPC_Glue());
		this.addRoleFournis(new Called("toServer_ReceiveRequest",TypeConnexion.CONTINU));
		this.addRoleFournis(new Called("toClient_ReceiveRequest",TypeConnexion.CONTINU));
		this.addRoleRequis(new Caller("fromClient_SendRequest",TypeConnexion.CONTINU));
		this.addRoleRequis(new Caller("fromServer_SendRequest",TypeConnexion.CONTINU));
	}

}
