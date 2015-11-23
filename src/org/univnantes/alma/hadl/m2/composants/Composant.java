package org.univnantes.alma.hadl.m2.composants;

import java.util.HashMap;
import java.util.Map;

import org.univnantes.alma.hadl.m2.autres.ContrainteTechnique;
import org.univnantes.alma.hadl.m2.autres.Propriete;
import org.univnantes.alma.hadl.m2.connecteurs.Connecteur;
import org.univnantes.alma.hadl.m2.interfaces.PortFournis;
import org.univnantes.alma.hadl.m2.interfaces.PortRequis;
import org.univnantes.alma.hadl.m2.interfaces.ServiceFournis;
import org.univnantes.alma.hadl.m2.interfaces.ServiceRequis;

public abstract class Composant {
	private String label;
	
	protected Map<String,ContrainteTechnique> contraintes = new HashMap<String,ContrainteTechnique>();
	protected Map<String,Propriete> proprietes = new HashMap<String,Propriete>();
	
	protected Map<String,PortFournis> portsfournis = new HashMap<String,PortFournis>();
	protected Map<String,PortRequis> portsrequis = new HashMap<String,PortRequis>();
	protected Map<String,ServiceFournis> servicesfournis = new HashMap<String,ServiceFournis>();
	protected Map<String,ServiceRequis> servicesrequis = new HashMap<String,ServiceRequis>();
	
	protected Map<String,Connecteur> connecteurs = new HashMap<String,Connecteur>();
	
	public Composant(String label){
		this.label = label;
	}
	
	public String getLabel(){
		return label;
	}
	
	public void setLabel(String label){
		this.label = label;
	}
}
