package org.univnantes.alma.hadl.m2.composants;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

import org.univnantes.alma.hadl.m2.autres.Attachement;
import org.univnantes.alma.hadl.m2.autres.Binding;
import org.univnantes.alma.hadl.m2.interfaces.ConfigPortFournis;
import org.univnantes.alma.hadl.m2.interfaces.ConfigPortRequis;

public class Configuration extends Composant{

	protected Set<ConfigPortRequis> configPortsRequis;
	protected Set<ConfigPortFournis> configPortsFournis;
	
	protected Set<Composant> composants;
	
	protected Set<Attachement> attachements;
	
	protected Set<Binding> bindings;
	
	public Configuration(String label) {
		super(label);
		
		configPortsRequis =  new HashSet<ConfigPortRequis>();
		configPortsFournis = new HashSet<ConfigPortFournis>();
		composants = new HashSet<Composant>();
		attachements = new HashSet<Attachement>();
		bindings = new HashSet<Binding>();
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
	
	public boolean addBinding(Binding e) {
		return bindings.add(e);
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
	
	public Set<Binding> getBindings(){
		return bindings;
	}
	
	public Composant getComposantByLabel(String label) {
		for(Composant c : composants){
			if(c.getLabel() == label){
				return c;
			}
		}
		return null;
	}
	
	public ConfigPortFournis getConfigPortFournisByLabel (String label){
		for(ConfigPortFournis c : configPortsFournis){
			if(c.getLabel() == label){
				return c;
			}
		}
		return null;
	}
	
	public ConfigPortRequis getConfigPortRequisByLabel (String label){
		for(ConfigPortRequis c : configPortsRequis){
			if(c.getLabel() == label){
				return c;
			}
		}
		return null;
	}

	@Override
	public void update(Observable observable, Object o) {

	}
}
