package org.univnantes.alma.hadl.m2.connecteurs;

import java.util.Map;

import org.univnantes.alma.hadl.m2.autres.ContrainteTechnique;
import org.univnantes.alma.hadl.m2.autres.Propriete;
import org.univnantes.alma.hadl.m2.composants.Composant;
import org.univnantes.alma.hadl.m2.interfaces.Role;

public abstract class Connecteur {
	protected Glue glue;
	protected Map<String,ContrainteTechnique> contraintes;
	protected Map<String,Propriete> proprietes;
	protected Map<String,Role> roles;
	
	protected Map<String,Composant> composants;
}
