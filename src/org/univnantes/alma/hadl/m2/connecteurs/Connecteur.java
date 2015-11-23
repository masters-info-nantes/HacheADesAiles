package org.univnantes.alma.hadl.m2.connecteurs;

import java.util.HashSet;
import java.util.Set;

import org.univnantes.alma.hadl.m2.autres.ContrainteTechnique;
import org.univnantes.alma.hadl.m2.autres.Propriete;
import org.univnantes.alma.hadl.m2.composants.Composant;
import org.univnantes.alma.hadl.m2.interfaces.RoleFournis;
import org.univnantes.alma.hadl.m2.interfaces.RoleRequis;

public abstract class Connecteur {
	private String label;
	protected Glue glue;
	protected Set<ContrainteTechnique> contraintes = new HashSet<ContrainteTechnique>();
	protected Set<Propriete> proprietes = new HashSet<Propriete>();
	
	protected Set<RoleRequis> rolesrequis = new HashSet<RoleRequis>();
	protected Set<RoleFournis> rolesfournis = new HashSet<RoleFournis>();
	
	protected Set<Composant> composants = new HashSet<Composant>();
	
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

	public Glue getGlue() {
		return glue;
	}

	public void setGlue(Glue glue) {
		this.glue = glue;
	}

	public boolean add(ContrainteTechnique e) {
		return contraintes.add(e);
	}

	public boolean add(Propriete e) {
		return proprietes.add(e);
	}

	public boolean add(RoleRequis e) {
		return rolesrequis.add(e);
	}

	public boolean add(RoleFournis e) {
		return rolesfournis.add(e);
	}

	public boolean add(Composant e) {
		return composants.add(e);
	}
	
	
}
