package org.univnantes.alma.hadl.m2.connecteurs;

import java.util.HashMap;
import java.util.Map;

import org.univnantes.alma.hadl.m2.autres.ContrainteTechnique;
import org.univnantes.alma.hadl.m2.autres.Propriete;
import org.univnantes.alma.hadl.m2.composants.Composant;
import org.univnantes.alma.hadl.m2.interfaces.Role;

public abstract class Connecteur {
	private String label;
	protected Glue glue;
	protected Map<String,ContrainteTechnique> contraintes = new HashMap<String, ContrainteTechnique>();
	protected Map<String,Propriete> proprietes = new HashMap<String, Propriete>();
	
	protected Map<String,Role> roles = new HashMap<String, Role>();
	
	protected Map<String,Composant> composants = new HashMap<String, Composant>();
	
	public Connecteur(String label){
		this.label = label;
		this.glue = new Glue();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
