package org.univnantes.alma.hadl.m2.composants;

import java.util.Set;

import org.univnantes.alma.hadl.m2.autres.Attachement;
import org.univnantes.alma.hadl.m2.interfaces.ConfigPort;

public class Configuration extends Composant{

	protected Set<ConfigPort> configPorts;
	
	protected Set<Composant> composants;
	
	protected Set<Attachement> attachements;
	
	public Configuration(String label) {
		super(label);
		// TODO Auto-generated constructor stub
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
	
	
}
