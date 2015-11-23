package org.univnantes.alma.hadl.m2.composants;

import java.util.HashSet;
import java.util.Set;

import org.univnantes.alma.hadl.m2.autres.ContrainteTechnique;
import org.univnantes.alma.hadl.m2.autres.Propriete;
import org.univnantes.alma.hadl.m2.connecteurs.Connecteur;
import org.univnantes.alma.hadl.m2.interfaces.PortFournis;
import org.univnantes.alma.hadl.m2.interfaces.PortRequis;
import org.univnantes.alma.hadl.m2.interfaces.ServiceFournis;
import org.univnantes.alma.hadl.m2.interfaces.ServiceRequis;

public abstract class Composant {
	private String label;
	
	protected Set<ContrainteTechnique> contraintes = new HashSet<ContrainteTechnique>();
	protected Set<Propriete> proprietes = new HashSet<Propriete>();
	
	protected Set<PortFournis> portsfournis = new HashSet<PortFournis>();
	protected Set<PortRequis> portsrequis = new HashSet<PortRequis>();
	protected Set<ServiceFournis> servicesfournis = new HashSet<ServiceFournis>();
	protected Set<ServiceRequis> servicesrequis = new HashSet<ServiceRequis>();
	
	protected Set<Connecteur> connecteurs = new HashSet<Connecteur>();
	
	public Composant(String label){
		this.label = label;
	}
	
	public String getLabel(){
		return label;
	}
	
	public void setLabel(String label){
		this.label = label;
	}

	public boolean add(ContrainteTechnique e) {
		return contraintes.add(e);
	}

	public boolean add(Propriete e) {
		return proprietes.add(e);
	}

	public boolean add(PortFournis e) {
		return portsfournis.add(e);
	}

	public boolean add(PortRequis e) {
		return portsrequis.add(e);
	}

	public boolean add(ServiceFournis e) {
		return servicesfournis.add(e);
	}

	public boolean add(ServiceRequis e) {
		return servicesrequis.add(e);
	}

	public boolean add(Connecteur e) {
		return connecteurs.add(e);
	}
	
	
}
