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

	public boolean addContrainte(ContrainteTechnique e) {
		return contraintes.add(e);
	}

	public boolean addPropriete(Propriete e) {
		return proprietes.add(e);
	}

	public boolean addPortFournis(PortFournis e) {
		return portsfournis.add(e);
	}

	public boolean addPortRequis(PortRequis e) {
		return portsrequis.add(e);
	}

	public boolean addServiceFournis(ServiceFournis e) {
		return servicesfournis.add(e);
	}

	public boolean addServiceRequis(ServiceRequis e) {
		return servicesrequis.add(e);
	}

	public boolean addConnecteur(Connecteur e) {
		return connecteurs.add(e);
	}

	public Set<ContrainteTechnique> getContraintes() {
		return contraintes;
	}

	public Set<Propriete> getProprietes() {
		return proprietes;
	}

	public Set<PortFournis> getPortsfournis() {
		return portsfournis;
	}

	public Set<PortRequis> getPortsrequis() {
		return portsrequis;
	}

	public Set<ServiceFournis> getServicesfournis() {
		return servicesfournis;
	}

	public Set<ServiceRequis> getServicesrequis() {
		return servicesrequis;
	}

	public Set<Connecteur> getConnecteurs() {
		return connecteurs;
	}

	public Connecteur getConnecteurByLabel(String label) {
		for(Connecteur c : connecteurs){
			if(c.getLabel() == label){
				return c;
			}
		}
		return null;
	}
	
	public PortRequis getPortRequisByLabel(String label){
		for(PortRequis p : portsrequis){
			if(p.getLabel() == label){
				return p;
			}
		}
		return null;
	}
	
	public PortFournis getPortFournisByLabel(String label){
		for(PortFournis p : portsfournis){
			if(p.getLabel() == label){
				return p;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "Composant [label=" + label + "]";
	}
	
	
}
