package org.univnantes.alma.hadl.m1.connecteurs;

import org.univnantes.alma.hadl.m1.roles.Called;
import org.univnantes.alma.hadl.m1.roles.Caller;
import org.univnantes.alma.hadl.m2.connecteurs.Connecteur;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

public class ClearanceRequest extends Connecteur {

	public ClearanceRequest(String label) {
		super(label);

		this.setGlue(new ClearanceRequest_Glue());
		this.addRoleFournis(new Called("toSecurityCheck",TypeConnexion.CONTINU));
		this.addRoleFournis(new Called("toSecurityAuth",TypeConnexion.CONTINU));
		this.addRoleRequis(new Caller("fromSecurityCheck",TypeConnexion.CONTINU));
		this.addRoleRequis(new Caller("fromSecurityAuth",TypeConnexion.CONTINU));
	}

}
