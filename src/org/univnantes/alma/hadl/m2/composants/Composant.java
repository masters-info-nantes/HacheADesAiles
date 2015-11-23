package org.univnantes.alma.hadl.m2.composants;

import java.util.HashMap;
import java.util.Map;

import org.univnantes.alma.hadl.m2.autres.ContrainteTechnique;
import org.univnantes.alma.hadl.m2.autres.Propriete;
import org.univnantes.alma.hadl.m2.connecteurs.Connecteur;
import org.univnantes.alma.hadl.m2.interfaces.Interface;

public abstract class Composant {
	protected Map<String,ContrainteTechnique> contraintes = new HashMap<String,ContrainteTechnique>();
	protected Map<String,Propriete> proprietes = new HashMap<String,Propriete>();
	protected Map<String,Interface> interfaces = new HashMap<String,Interface>();
	
	protected Map<String,Connecteur> connecteurs = new HashMap<String,Connecteur>();
	
	
}
