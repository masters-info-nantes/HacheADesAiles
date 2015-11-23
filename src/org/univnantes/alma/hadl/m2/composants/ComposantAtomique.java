package org.univnantes.alma.hadl.m2.composants;

import java.util.Map;

import org.univnantes.alma.hadl.m2.interfaces.Port;
import org.univnantes.alma.hadl.m2.interfaces.Service;

public class ComposantAtomique extends Composant{

	protected Map<String,Port> ports;
	protected Map<String,Service> services;
}
