package org.univnantes.alma.hadl.m2.composants;

import java.util.HashSet;
import java.util.Set;

import org.univnantes.alma.hadl.m2.autres.ContrainteTechnique;
import org.univnantes.alma.hadl.m2.autres.Propriete;
import org.univnantes.alma.hadl.m2.interfaces.Interface;

public abstract class Composant {
	protected Set<ContrainteTechnique> contraintes = new HashSet<ContrainteTechnique>();
	protected Set<Propriete> proprietes = new HashSet<Propriete>();
	protected Set<Interface> interfaces = new HashSet<Interface>();
}
