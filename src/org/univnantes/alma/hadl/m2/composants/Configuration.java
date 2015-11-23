package org.univnantes.alma.hadl.m2.composants;

import java.util.Map;

import org.univnantes.alma.hadl.m2.interfaces.ConfigPort;

public class Configuration extends Composant{

	protected Map<String,ConfigPort> configPorts;
	
	protected Map<String,Composant> composants;
}
