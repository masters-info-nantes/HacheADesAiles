package org.univnantes.alma.hadl.m1.connecteurs;

import org.univnantes.alma.hadl.m1.roles.Called;
import org.univnantes.alma.hadl.m1.roles.Caller;
import org.univnantes.alma.hadl.m2.connecteurs.Connecteur;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

public class SecurityQuery extends Connecteur {

	public SecurityQuery(String label) {
		super(label);

		this.setGlue(new SecurityQuery_Glue());
		this.add(new Called("toSecurityManagement",TypeConnexion.CONTINU));
		this.add(new Called("toCheckQuery",TypeConnexion.CONTINU));
		this.add(new Caller("fromSecurityManagement",TypeConnexion.CONTINU));
		this.add(new Caller("fromCheckQuery",TypeConnexion.CONTINU));
	}

}
