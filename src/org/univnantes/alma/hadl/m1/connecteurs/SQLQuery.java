package org.univnantes.alma.hadl.m1.connecteurs;

import org.univnantes.alma.hadl.m1.roles.Called;
import org.univnantes.alma.hadl.m1.roles.Caller;
import org.univnantes.alma.hadl.m2.connecteurs.Connecteur;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

public class SQLQuery extends Connecteur {

	public SQLQuery(String label) {
		super(label);
		
		this.setGlue(new SQLQuery_Glue());
		this.addRoleFournis(new Called("toDBQuery",TypeConnexion.CONTINU));
		this.addRoleFournis(new Called("toQueryD",TypeConnexion.CONTINU));
		this.addRoleRequis(new Caller("fromDBQuery",TypeConnexion.CONTINU));
		this.addRoleRequis(new Caller("fromQueryD",TypeConnexion.CONTINU));
	}

}
