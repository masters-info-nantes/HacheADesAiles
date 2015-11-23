package org.univnantes.alma.hadl.m2.connecteurs;

import java.util.Map;

import org.univnantes.alma.hadl.m2.connecteurs.Connecteur;

public class ConnecteurComposite extends Connecteur {

	protected Map<String,Connecteur> connecteurs;
}
