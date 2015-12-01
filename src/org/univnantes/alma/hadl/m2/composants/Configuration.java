package org.univnantes.alma.hadl.m2.composants;

import java.util.HashSet;
import java.util.Set;

import org.univnantes.alma.hadl.m2.autres.Attachement;
import org.univnantes.alma.hadl.m2.interfaces.ConfigPort;

public class Configuration extends Composant{

	protected Set<ConfigPort> configPorts;
	
	protected Set<Composant> composants;
	
	protected Set<Attachement> attachements;
	
	public Configuration(String label) {
		super(label);
		
		configPorts =  new HashSet<ConfigPort>();
		composants = new HashSet<Composant>();
		attachements = new HashSet<Attachement>();
	}

	public boolean add(ConfigPort e) {
		return configPorts.add(e);
	}

	public boolean add(Composant e) {
		return composants.add(e);
	}

	public boolean add(Attachement e) {
		return attachements.add(e);
	}

	public Set<ConfigPort> getConfigPorts() {
		return configPorts;
	}

	public Set<Composant> getComposants() {
		return composants;
	}

	public Set<Attachement> getAttachements() {
		return attachements;
	}
	
	
}
