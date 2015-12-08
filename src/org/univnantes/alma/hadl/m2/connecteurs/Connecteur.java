package org.univnantes.alma.hadl.m2.connecteurs;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import org.univnantes.alma.hadl.m2.autres.ContrainteTechnique;
import org.univnantes.alma.hadl.m2.autres.Propriete;
import org.univnantes.alma.hadl.m2.composants.Composant;
import org.univnantes.alma.hadl.m2.interfaces.RoleFournis;
import org.univnantes.alma.hadl.m2.interfaces.RoleRequis;

public abstract class Connecteur extends Observable implements Observer{
	
	private String label;
	protected Glue glue;
	protected Set<ContrainteTechnique> contraintes;
	protected Set<Propriete> proprietes;
	
	protected Set<RoleRequis> rolesrequis;
	protected Set<RoleFournis> rolesfournis;
	
	protected Set<Composant> composants;
	
	public Connecteur(String label){
		this.label = label;
		this.glue = new Glue();
		this.contraintes = new HashSet<ContrainteTechnique>();
		this.proprietes = new HashSet<Propriete>();
		this.rolesrequis = new HashSet<RoleRequis>();
		this.rolesfournis = new HashSet<RoleFournis>();
		this.composants = new HashSet<Composant>();
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

	public boolean addContrainteTechnique(ContrainteTechnique e) {
		return contraintes.add(e);
	}

	public boolean addPropriete(Propriete e) {
		return proprietes.add(e);
	}

	public boolean addRoleRequis(RoleRequis e) {
		e.addObserver(this);
		return rolesrequis.add(e);
	}

	public boolean addRoleFournis(RoleFournis e) {
		this.addObserver(e);
		return rolesfournis.add(e);
	}

	public boolean addComposant(Composant e) {
		return composants.add(e);
	}

	public Set<RoleRequis> getRolesrequis() {
		return rolesrequis;
	}

	public Set<RoleFournis> getRolesfournis() {
		return rolesfournis;
	}
	
	public RoleFournis getRoleFournisByLabel(String label){
		for(RoleFournis r : rolesfournis){
			if(r.getLabel() == label){
				return r;
			}
		}
		return null;
	}
	
	public RoleRequis getRoleRequisByLabel(String label){
		for(RoleRequis r : rolesrequis){
			if(r.getLabel() == label){
				return r;
			}
		}
		return null;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
	}
	
	
}
