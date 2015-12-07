package org.univnantes.alma.hadl.m2.composants;

import java.util.HashSet;
import java.util.Set;

import org.univnantes.alma.hadl.m2.autres.Attachement;
import org.univnantes.alma.hadl.m2.interfaces.ConfigPortFournis;
import org.univnantes.alma.hadl.m2.interfaces.ConfigPortRequis;

public class Configuration extends Composant{

	protected Set<ConfigPortRequis> configPortsRequis;
	protected Set<ConfigPortFournis> configPortsFournis;
	
	protected Set<Composant> composants;
	
	protected Set<Attachement> attachements;
	
	public Configuration(String label) {
		super(label);
		
		configPortsRequis =  new HashSet<ConfigPortRequis>();
		configPortsFournis = new HashSet<ConfigPortFournis>();
		composants = new HashSet<Composant>();
		attachements = new HashSet<Attachement>();
	}

	public boolean addConfigPortRequis(ConfigPortRequis e) {
		return configPortsRequis.add(e);
	}
	
	public boolean addConfigPortFournis(ConfigPortFournis e) {
		return configPortsFournis.add(e);
	}

	public boolean addComposant(Composant e) {
		return composants.add(e);
	}

	public boolean addAttachement(Attachement e) {
		return attachements.add(e);
	}

	public Set<ConfigPortRequis> getConfigPortsRequis() {
		return configPortsRequis;
	}
	
	public Set<ConfigPortFournis> getConfigPortsFournis() {
		return configPortsFournis;
	}

	public Set<Composant> getComposants() {
		return composants;
	}

	public Set<Attachement> getAttachements() {
		return attachements;
	}
	
	public Composant getComposantByLabel(String label) {
		for(Composant c : composants){
			if(c.getLabel() == label){
				return c;
			}
		}
		return null;
	}
}
