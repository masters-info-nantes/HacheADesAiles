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
	
	protected Set<ContrainteTechnique> contraintes;
	protected Set<Propriete> proprietes;
	
	protected Set<PortFournis> portsfournis;
	protected Set<PortRequis> portsrequis;
	protected Set<ServiceFournis> servicesfournis;
	protected Set<ServiceRequis> servicesrequis;
	
	protected Set<Connecteur> connecteurs;
	
	public Composant(String label){
		this.label = label;
		this.contraintes = new HashSet<ContrainteTechnique>();
		this.proprietes = new HashSet<Propriete>();
		this.portsfournis = new HashSet<PortFournis>();
		this.portsrequis = new HashSet<PortRequis>();
		this.servicesfournis = new HashSet<ServiceFournis>();
		this.servicesrequis = new HashSet<ServiceRequis>();
		this.connecteurs = new HashSet<Connecteur>();
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
