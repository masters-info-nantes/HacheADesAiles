package org.univnantes.alma.hadl.m2.connecteurs;

import java.util.Set;

import org.univnantes.alma.hadl.m2.autres.ContrainteTechnique;
import org.univnantes.alma.hadl.m2.autres.Propriete;
import org.univnantes.alma.hadl.m2.interfaces.Role;

public abstract class Connecteur {
	protected Glue glue;
	protected Set<ContrainteTechnique> contraintes;
	protected Set<Propriete> proprietes;
	protected Set<Role> roles;
	
}
