package org.univnantes.alma.hadl.m1.connecteurs;

import org.univnantes.alma.hadl.m1.roles.Called;
import org.univnantes.alma.hadl.m1.roles.Caller;
import org.univnantes.alma.hadl.m2.connecteurs.Connecteur;
import org.univnantes.alma.hadl.m2.interfaces.TypeConnexion;

public class SQLQuery extends Connecteur {

	public SQLQuery(String label) {
		super(label);
		
		this.setGlue(new SQLQuery_Glue());
		this.add(new Called("toDBQuery",TypeConnexion.CONTINU));
		this.add(new Called("toQueryD",TypeConnexion.CONTINU));
		this.add(new Caller("fromDBQuery",TypeConnexion.CONTINU));
		this.add(new Caller("fromQueryD",TypeConnexion.CONTINU));
	}

}
